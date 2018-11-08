
public class Contacts {
	private String[] phoneNum;
	private userID[] idString;
	
	//constructor
	public Contacts(String first, String last, String num){
		phoneNum[phoneNum.length+1]=num;
		idString[idString.length+1]= new userID(first,last);
	}
	
	public Contacts(userID idVal, String num){
		phoneNum[phoneNum.length+1]=num;
		idString[idString.length+1]=idVal;
	}
	
	//mutators
	public void setPhoneNum(String first, String last, String newNum){
		int value = -1;
		for(int i=0;i<idString.length;i++){
			if(idString[i].equals(new userID(first, last))){
				value = i;
			}
		}
		if(value != -1){
		phoneNum[value]= newNum;
		}
	}
	public void setContactName(String num,String newFirst, String newLast){
		int value = -1;
		for(int i=0;i<phoneNum.length;i++){
			if(phoneNum[i].equals(num)){
				value = i;
			}
		}
		if(value != -1){
		idString[value] = new userID(newFirst, newLast);
		}
	}
	
	
	
	
	//getters
	public String getContactName(String num){
		int value = -1;
		for(int i=0;i<phoneNum.length;i++){
			if(phoneNum[i].equals(num)){
				value = i;
			}
		}
		if (value == -1){
			return "Given number does not exist";
		}else{
			return idString[value].toString();
		}
	}
	public String getPhoneNum(String first, String last){
		int value = -1;
		for(int i=0;i<idString.length;i++){
			if(idString[i].equals(new userID(first, last))){
				value = i;
			}
		}
		if (value == -1){
			return "Given name does not exist";
		}else{
			return phoneNum[value];
		}
	}

}
