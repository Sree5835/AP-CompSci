
public class ReferencesNotes {
	public static void main(String[] args){
		//Create a JavaCircle of radius 3, center
		//at(-1,4), and color Pink;
		CoordinatePoint p1 = new CoordinatePoint(-1,4);
		JavaCircle pinkCircle = new JavaCircle(3,p1,"Pink");
		
		//PRIMITIES:
		int x =42;
		int y = 5;
		
		x=y;
		y= -2;
		//System.out.println("x is : "+ x+ ", y is : " + y);
		//this will return x=5, y=-2;
		
		
		//OBJECTS:
		JavaCircle greenCircle= new JavaCircle(4,p1, "Green");
		
		greenCircle = pinkCircle;
		System.out.println("Green Circle radius: " + greenCircle.getRadius());
		System.out.println("Pink Circle radius: " + pinkCircle.getRadius());
		pinkCircle.setRadius(9.0);
		System.out.println("Green Circle radius: " + greenCircle.getRadius());
		System.out.println("Pink Circle radius: " + pinkCircle.getRadius());
		//the reason that both pink and green cricles return the same thing is because green was pointing to pink when I set them equal.
	}
}