
public class userID {
	private String[] firstName;
	private String[] lastName;
	private String[] idString;
	
	//constructor
	public userID(String first, String last){
		firstName[firstName.length+1]=first;
		lastName[lastName.length+1]=last;
		idString[idString.length+1] = first+last.substring(0,3);
	}
	
	//mutators
	public void setFirstName(String last, String newFirst){
		int value = -1;
		for(int i=0;i<lastName.length;i++){
			if(lastName[i].equals(last)){
				value = i;
			}
		}
		if(value != -1){
			firstName[value]= newFirst;
		}
	}
	public void setLastName(String first, String newLast){
		int value = -1;
		for(int i=0;i<firstName.length;i++){
			if(firstName[i].equals(first)){
				value = i;
			}
		}
		if(value != -1){
			firstName[value]= newLast;
		}
	}
	
	//setters
	public String getIdString(String first, String last){
		int value1 = -1;
		int value2 = -1;
		for(int i=0;i<firstName.length;i++){
			if(firstName[i].equals(first)){
				value1 = i;
			}
		}
		for(int i=0;i<lastName.length;i++){
			if(lastName[i].equals(last)){
				value2 = i;
			}
		}
		if(value1 == value2){
		return  idString[value1];
		}else{
			return "The names are incorrect";
		}
	}
}
