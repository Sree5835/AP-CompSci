import java.util.ArrayList;
public class InstanceOfKeyword 
{

	public static void main(String[] args) 
	{
		ArrayList<Human> somePeople = new ArrayList<Human>();
		
		for(int i = 0; i < 8; i++)
		{
			int rand = (int)(Math.random()*3);
			if(rand == 0)
			{
				somePeople.add(new Human());
			}
			
			else if(rand == 1)
			{
				somePeople.add(new Student());
			}
			else
			{
				somePeople.add(new Teacher());
			}
		}if(somePeople.get(3) instanceof Student){
		somePeople.get(0).doSomething();
		}
	}

}
