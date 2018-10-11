
public class RandomNumbers {
	public static void main(String[] args)
	{
		//create a random number between [0,1)
		double rand = Math.random();
		System.out.println(rand);
		
		//random number between [0,7)
		double rand1 = Math.random()*7;
		
		//random number between {5,6)
		double rand2= Math.random()+5;
		
		//random number between [2,5)
		double rand3 = (Math.random()*13)+2;
		
		//random integer between [8,20)
		int rand4 = (int)(Math.random()*12)+8;
		System.out.println(rand4);
		
		//random integer between [8,20]
		int rand5 = (int)(Math.random()*13)+8;
		System.out.println(rand4);
	}
}
