public class VariablesAndMethods 
	{
		public static void main(String[] args)
		{
			//int -- data 
			//x -- variable name 
			//= -- assignment operator
			//4 -- value
			
			int x = 4; 
			double y = 7;
			double xPlusY = addTwoNumbers(x, y); 
			
			double xToTheY = Math.pow(x, y);
			
			System.out.println("x is " + x + ", y is " + y);
			System.out.println("xPlusY is " +xPlusY);
			System.out.println("xToTheY is " +xToTheY);
			
		}
		
		//METHOD HEADER
		//public -- access specifier (public or private)
		//static -- method belongs to the class, not an object
		//double -- return type
		//addTwoNumbers -- method name
		private static double addTwoNumbers(double a, double b)
		{
			//Method Body
			return (a + b);
			
		}
	}