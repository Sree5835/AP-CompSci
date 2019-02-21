import java.util.ArrayList;

public class FlierTester
{
	public static void main(String[] args)
	{
		/*
		//Flier f1 = new Flier(); //invalid
		Bird b1 = new Bird(); //valid
		Flier b2 = new Bird(); //valid
		System.out.println(b2.fly(300)); //valid
		b1.setAltitude(.5); //valid
		//b2.setAltitude(0.4); //invalid (didn't cast)
		((Bird)b2).setAltitude(0.4); //valid
		
		Airplane a1 = new Airplane(); //valid
		Flier a2 = new Airplane(); //valid
		//a2 = b1; //valid
		System.out.println(a2.fly(400));
		System.out.println("");
		
		System.out.println(a1.compareTo(a2));
		System.out.println(((Airplane)a2).compareTo(a1));
		
		System.out.println(a1.compareTo(b2));
		//System.out.println(((Bird)b2).compareTo(a1));
		*/
		
		
		ArrayList<Flier> someFliers = new ArrayList<Flier>();
		
		for(int i = 0; i < 5; i++)
		{
			int rand = (int)(Math.random()*2) + 1;
			if(rand == 1)
				someFliers.add(new Bird(i, i, "Green"));
			else
				someFliers.add(new Airplane(i, i));
		}
		
		
		//loop through and print out the feather color
		//of any Bird objects in someFliers
		for(Flier f:someFliers)
		{
			if(f instanceof Bird)
			{
				System.out.println(((Bird)f).getColor());
			}
		}
		
		
	}
		
	private static void fullTrip(Flier aFlier)
	{
		aFlier.takeOff();
		aFlier.fly(10);
		aFlier.land();
	}
}