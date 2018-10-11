//Name: Sricharan Sanakkayala
//Period: 2 

public class StringMethodsLab 
{
	
	public static void main(String[] args){
		//test 1
		String name = "Sricharan Sanakkayala";
		System.out.println(proper(name));
		//test 2
		System.out.println(email("SrICharan", "Sanakkayala"));
		//test 3
		System.out.println(rearranger("Sanakkayala"));
		//test 4
		System.out.println(pigLatin("SrICharan"));
		//test 5
		System.out.println(funkyCap("SrICharan"));
		//test 6
		System.out.println(nickname("SrICharan SANAkkayala"));
	}
	//precondition: text.length() > 0
	//postcondition: returns the proper form of the name
	//              i.e. first letter capitalized the rest of the name lower case
	public static String proper(String text)
	{
		text = text.toUpperCase();
		char firstChar = text.charAt(0);
		text = text.toLowerCase();
		text = text.substring(1);
		text = firstChar + text;
		return text;
	}
	
	//precondition: the explicit parameters have length greater than 0
	//postcondition: returns the generated email in the format of:
	//              (first name) + (first 3 characters of last name) 
	//				+ (random number 1-20) + "@k12.ipsd.org" --> all lower case
	//			    example:  email(John, Riddle) returns "johnrid18@k12.ipsd.org"
	public static String email(String firstName, String lastName)
	{
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase().substring(0, 3);
		int randNum = (int) (Math.random()*20)+1;
		String email = firstName + lastName + randNum+ "@k12.ipsd.org";
		return email;
		
	}
	
	//precondition: text.length() > 0
	//postcondition: returns a new word with the first letter and last letters of text switched
	//				example: rearranger(John) returns Nohj (note the capitalization)
	public static String rearranger(String text)
	{
		int lenght = text.length();
		char firstLetter = text.charAt(0);
		char lastLetter = text.charAt((lenght-1));
		return proper(lastLetter + text.substring(1, (lenght-1))+ firstLetter);
		
	}	
	

	//there will be two more methods for you to code.  When you do, make sure
	//you include the precondition and postcondition as part of your commenting system
	
	//precondition: text.length() >= 2
	//postcondition:  returns a new word rearranged in pig latin style. 
	//				this is done by moving the first letter to the very end,
	//				and adding "ay" at the end.  for example, "John" becomes "Ohnjay"
	//				and "Metea" becomes "Eteamay".  Note the capitalization.
	public static String pigLatin(String text)
	{
		char firstLetter = text.charAt(0);
		return proper(text.substring(1)+ firstLetter + "ay");
		
	}

	
	//precondition: text.length() >= 2
	//postcondition:  returns a new String with the first letter, the middle letter, and the last letter
	//				all capitalized.  If there's an even number of letters, the middle letter is the 
	//				letter closer to the front.  For example, "John" returns "JOhN" and "tomizzo" returns "TomIzzO".
	public static String funkyCap(String text)
	{
		int lenght = text.length();
		text = text.toUpperCase();
		char firstLetter = text.charAt(0);
		char lastLetter = text.charAt((lenght-1));
		int midNum = ((lenght+1)/2)-1;
		char midLetter = text.charAt(midNum);
		text = text.toLowerCase();
		return firstLetter + text.substring(1, (midNum)) + midLetter + text.substring(midNum+1, (lenght-1))+ lastLetter;
	}
	
	//precondition:  text.length() >=3 and has exactly one space somewhere between the first and the last letter
	//postcondition: returns a new string with the first letter in the first word (before the space) and the 
	//				first letter in the second word (after the space) switched.  For example, "John Riddle" returns "Rohn Jiddle"
	//				and "Tim Mills" returns "Mim Tills"
	public static String nickname(String text)
	{
		text = text.toUpperCase();
		int lenght = text.length();
		int spaceNum = text.indexOf(" ");
		String firstName = proper(text.substring(0, spaceNum+1));
		String lastName = proper(text.substring(spaceNum+1,lenght));
		char firstLetterfn = firstName.charAt(0);
		char firstLetterln = lastName.charAt(0);
		return firstLetterln + text.substring(1, spaceNum+1).toLowerCase() + firstLetterfn + text.substring(spaceNum+2,lenght).toLowerCase();
	}
}