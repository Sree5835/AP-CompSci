
public class ArrayContacts {
	private userID idString;
	private String[] phoneNum = new String[5];
	private int numPhone=5;
	
	//constructor
	public ArrayContacts(String first, String last, String num){
		phoneNum[phoneNum.length-numPhone]=num;
		numPhone-=1;
		idString= new userID(first,last);
	}
	
	public ArrayContacts(userID idVal, String num){
		phoneNum[phoneNum.length-numPhone]=num;
		numPhone-=1;
		idString=idVal;
	}
	
	//mutators
	public void addPhoneNum(String newNum){
			phoneNum[phoneNum.length-numPhone]= newNum;
			numPhone-=1;
	}
	public void setContactName(String newFirst, String newLast){
			idString = new userID(newFirst, newLast);
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
		return phoneNum.length-numPhone;
	}
	public String getGeneratedId(){
		return idString.getIdString();
	}
}
