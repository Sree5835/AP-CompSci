public class MathMethods 
{

	public static void main(String[] args) 
	{
		System.out.println(heronsFormula(3,7,8));
		System.out.println(makeSlope(1,1,2,2));
		System.out.println(randomInt(10,20));
		System.out.println(coneVolume(5,10));
		

	}
	public static double heronsFormula(double a, double b, double c) 
	{
		double s =(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public static double makeSlope(double x1, double y1, double x2, double y2) 
	{
		double m = (y2-y1)/(x2-x1);
		return m;
	}
	public static double randomInt(int a , int b) 
	{
		int num = (int)(Math.random()*((b-a)+1))+a;
		return num;   
	}
	
	public static double coneVolume(double r , double h){
		return (Math.PI/3.0)*(Math.pow(r, 2)*h);
	}
	
	
	

}