public class VariablesIntro 
{

	public static void main(String[] args) 
	{
		System.out.println("The purpose of this exercise is to introduce variables" +
						   "\nand the assignment statement");

		String firstName = "Marty";
		String lastName =  "Mustang";
		char middleInitial = 'M';
		int age = 17;
		double shoeSize = 10.5;
		
		//Print out the following statement:
		//ex.  "Marty M Mustang, you are 17 years old and wear a size 10.5 shoe."

		System.out.println(firstName + " "+ middleInitial + ". " + lastName + " " + ", you are " + age + " " + "years old and wear a size " + shoeSize+ " " + "shoe.");

	}

}