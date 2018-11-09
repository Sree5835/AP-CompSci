
public class userID {
	private String firstName;
	private String lastName;
	private String idString;
	
	//constructor
	public userID(String first, String last){
		firstName =first;
		lastName=last;
		idString = first+last.substring(0,3);
	}
	
	//getters
	public String getIdString(){
		return idString;
	}
	public String getUserName(){
		return firstName + " " + lastName;
	}
}
