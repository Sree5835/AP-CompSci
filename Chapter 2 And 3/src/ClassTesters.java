
public class ClassTesters {
	public static void main(String args[]){
		//make a java circle of radius 7,, center at (0,0), and color orange
	JavaCircle spookyCircle = new JavaCircle(7 ,0,0,"orange");
	
	
	//print out the y-cooridinate of spookyCircle
	System.out.print(spookyCircle.getYCenter());
	
	//change the y-coordinate of spookyCircle to -5
	spookyCircle.setYCenter(-5);
	
	//print out the y-cooridinate of spookyCircle again
		System.out.print(spookyCircle.getYCenter());
		
	//set and print the spookyCircle to a rand integert from 1,10 inclusive
		spookyCircle.setRadius((int)(Math.random()*10)+1);
		System.out.print(spookyCircle.getRadius());
	
	
		
	// testing coorinatpint object
		CoordinatePoint c = new CoordinatePoint(1,2);
		
		//create anjother coordinate point at (0,0)
		CoordinatePoint c1 = new CoordinatePoint();
	
	//create a circle of radius 3, centered at(-3,8), and orange color
	CoordinatePoint c2 = new CoordinatePoint(-3,8);
	JavaCircle funC = new JavaCircle(3, c2, "orange");
	
	
	
	
	//contacts
	
	String first = "sree";
	String last = "sanakkayala";
	
	ArrayContacts contact1 = new ArrayContacts(first, last , "630-133-5356");
	System.out.println();
	System.out.println(contact1.getContactName() + "'s phone number is: " +contact1.getPhoneNum(0));
	System.out.println(contact1.getContactName() + " has " + contact1.getNumberOfPhoneNum() + " phone numbers");
	contact1.addPhoneNum("630-467-4657");
	System.out.println(contact1.getContactName() + "'s phone number is: " +contact1.getPhoneNum(1));
	System.out.println(contact1.getContactName() + " has " + contact1.getNumberOfPhoneNum() + " phone numbers");
	contact1.setContactName("john", "riddle");;
	System.out.println(contact1.getContactName() + "'s phone number is: " +contact1.getPhoneNum(1));
	System.out.println(contact1.getContactName() + " has " + contact1.getNumberOfPhoneNum() + " phone numbers");
	System.out.println(contact1.getContactName() + "'s phone id is: " +contact1.getGeneratedId());
	
	}
}
