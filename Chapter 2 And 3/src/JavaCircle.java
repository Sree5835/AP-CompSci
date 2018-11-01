//public - access specifier (public or private)
//class - keyword to designate a class
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
	private CoordinatePoint myCenter;
	private String myColor;
	
	
	//2. contructor: we call the constructor "create" or "construct" an instance of the object
	//it's a special type of method.
	//the purpose of the constructor is to assign initial values to all instance fields. 
	
	public JavaCircle(double r, CoordinatePoint center, String c){
		myRadius = r;
		myCenter = center;
		myColor = c;
	}
	
	public JavaCircle(double r, double x, double y, String c){
		myRadius = r;
		myCenter = new CoordinatePoint(x,y);
		myColor = c;
	}
	
	
	
	
	
	
	
	
	
	//3. methods - two basic types are accessor (getter) and mutator (setter)
	
	//accessor methods- access (get) the current value of an instance field.
	
	public double getRadius(){
		return myRadius;
	}
	
	public CoordinatePoint getCenter(){
		return myCenter;
	}
	public double getXCenter(){
		return myCenter.getX();
	}
	public double getYCenter(){
		return myCenter.getY();
	}
	public String getColor(){
		return myColor;
	}
	
	//mutator methods: change (set) the value of the instance fields
	
	public void setRadius(double r){
		myRadius = r;
	}
	public void setCenter(CoordinatePoint c){
		myCenter = c;
	}
	public void setXCenter(double x){
		myCenter.setX(x);
	}
	public void setYCenter(double y){
		myCenter.setY(y);
	}
	public void setColor(String color){
		myColor = color;
	}  
}
