
public class StringMethods {
	
	public static void main(String[] args) 
	{
		System.out.println(helloName("Sree"));
		System.out.println(ignoreLastChar("cool guy"));
		
		System.out.println(combine("Hello","there"));
		//Big  Picture1 = to use a String method, you need to call it with the variable name.
		//Big Picture2 = calling a String method does Not change the value of the variables you call it with.
		
		
		//.length() method- returns the lenght of a String
		String s1 = "welcome, all";
		int l = s1.length();
		System.out.println(l);
		
		//.indexOf(String) method - returns the "location" of the parameter
		String s2 = "squidward";
		System.out.println(s2.indexOf("quid"));
		
		//.charAt(int) method - returns the charater at the parameter
		String s3 = "Happy Birthday!";
		System.out.println(s3.charAt(6));
		
		//.toUpperCase() method - returns a new Stirng that is all uppercase of the varaiable
		String s4 = "Dawg";
		System.out.println(s4.toUpperCase());
		
		//.toLowerCase() method - returns a new Stirng that is all lowercase of the variale
		String s5 = "Dawg";
		System.out.println(s5.toLowerCase());
		
		//.substring(int) - return a new String from index a to index b. Inclues a, excludes b.
		String  s6 = "squishy";
		System.out.println(s6.substring(3));
		
		//.substring(int,int) - return a new String from index a to index b. Inclues a, excludes b.
		String  s7 = "pineapple";
		System.out.println(s7.substring(2,5));
		
	}
	
	
	public static String combine ( String a , String b )
	{
		String c = a + " " + b;
		return(c);   
	}
	
	public static String helloName ( String a)
	{
		String b = "hello, " + a + ", how are you?";
		return(b);   
	}
	
	public static String ignoreLastChar(String a){
		int len = (a.length()-1);
		return a.substring(0,len);
	}
}


