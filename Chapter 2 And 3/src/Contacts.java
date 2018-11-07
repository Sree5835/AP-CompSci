
public class Contacts {
	private String[] phoneNum;
	private String[] contactName;
	
	//constructor
	public Contacts(String name, String num){
		phoneNum[phoneNum.length+1]=num;
		contactName[contactName.length+1]=name;
	}
	
	//mutators
	public void setPhoneNum(String name, String newNum){
		int value = -1;
		for(int i=0;i<contactName.length;i++){
			if(contactName[i].equals(name)){
				value = i;
			}
		}
		if(value != -1){
		phoneNum[value]= newNum;
		}
	}
	public void setContactName(String num,String newName){
		int value = -1;
		for(int i=0;i<phoneNum.length;i++){
			if(phoneNum[i].equals(num)){
				value = i;
			}
		}
		if(value != -1){
		contactName[value] = newName;
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
			return contactName[value];
		}
	}
	public String getPhoneNum(String name){
		int value = -1;
		for(int i=0;i<contactName.length;i++){
			if(contactName[i].equals(name)){
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
