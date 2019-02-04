
public class InheritanceTester {
	public static void main(String[] args){
	OrderedPair p1 = new OrderedPair(6,-7);
	ThreeDimOrderedPair p2 = new ThreeDimOrderedPair(-3,1,0);
	
//	System.out.println(p1);
//	System.out.println(p2);
	
	OrderedPair p3 = new ThreeDimOrderedPair();
//	System.out.println(p3);
	p3.setX(-5);
	//p3.setZ(-2); this is an complier error because p3 is type OrderedPair which doesn't have access to Z. So to get over it:
	((ThreeDimOrderedPair)p3).setZ(-2);
	System.out.println(p3.toString());//whenever the parent class can be overridden, the computer always does it.
	System.out.println(p3.distanceFrom(p2));
	System.out.println(p3.distanceFrom(p1));
	
	}
}
