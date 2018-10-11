public class Casting 
{
	public static void main(String[] args)
	{
		//example: different types of division
		int x = 5/3; //x is 1 because int just truncates. 
		int y = 5 % 3; //y is 2 (remainder)
		double z = 5 / 3; //z is 1.0
		double z2 = 5./3; //z2 is 1.6666667
		double z3 = 5/3.; //z3 is 1.6666667
		double z4 = (double)5/3; //z4 is 1.6666667
		//cast: "hey java, treat the next value AS the data type in parenthesis FOR JUST THIS LINE of code" 
		
		//System.out.println(z4);
		
		//example 2: data type conversions
		int a = 3; 
		double b = 4.5; 
		//b = a; // b is 3.0
		//a = b; // b is a double, you can't fit an int value into an int box. 
		a = (int)b; // telling java to treat b as an int for this line of code. a is 4
		
		System.out.println(a);
	}
}