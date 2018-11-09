
public class Contacts {
	private userID idString;
	private String phoneNum;
	
	//constructor
	public Contacts(String first, String last, String num){
		phoneNum=num;
		idString= new userID(first,last);
	}
	
	public Contacts(userID idVal, String num){
		phoneNum=num;
		idString=idVal;
	}
	
	//mutators
	public void addPhoneNum(String first, String last, String newNum){
		if(idString.equals(new userID(first, last))){
			phoneNum[phoneNum.length+1]= newNum;
		}
	}
	public void setContactName(String num,String newFirst, String newLast){
		int value = -1;
		for(int i=0;i<phoneNum.length;i++) {
			if(phoneNum[i]==num) {
				value = i;
			}
		}
		if(phoneNum[value].equals(num)&&value!=-1){
			idString = new userID(newFirst, newLast);
		}
	}
	
	
	
	
	//getters
	public String getContactName(){
			return idString.getUserName();
	}
	public String getPhoneNum(int num){
			return phoneNum[num];
	}
	public String getAllPhoneNum(){
		String str = "";
		for(int i=0;i<phoneNum.length;i++) {
				str += phoneNum[i] + " ";
		}
		return str;
	}
	public int getNumberOfPhoneNum(){
		return phoneNum.length;
	}
	public String getGeneratedId(){
		return idString.getIdString();
	}

}
