//public - access specifier (public or private)
//class - keyword to designate a clas
//JavaCricle - class name. Note the Capitalization.
		
//big picture: classes are the blueprint of an object
public class JavaCircle {
	//when you make a class, you need three things:
	//1. instance fields (Have/attributes)
	//2. the constructor(s) - tells us how to create an "instances of" the object
	//3. methods (DOES/behaviors)
	
	//1. instance fields - variables that the whole class has access to. almost always private
	//can be primitives or other objects.
	private double myRadius;
	private double myXCenter;
	private double myYCenter;
	private String myColor;
	
	
	//2. contructor: saved for tomorrow
	
	//3. methods - two basic types are accessor (getter) and mutator (setter)
	
	//accessor methods- access (get) the current value of an instance field.
	
	public double getRadius(){
		return myRadius;
	}
	public double getXCenter(){
		return myXCenter;
	}
	public double getYCenter(){
		return myYCenter;
	}
	public String getColor(){
		return myColor;
	}
	
	//mutator methods: change (set) the value of the instance fields
	
	public void setRadius(double r){
		myRadius = r;
	}
	public void setXCenter(double x){
		myXCenter = x;
	}
	public void setYCenter(double y){
		myXCenter = y;
	}
	public void setColor(String color){
		myColor = color;
	}
}
