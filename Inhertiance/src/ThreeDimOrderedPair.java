
public class ThreeDimOrderedPair extends OrderedPair {
	//instance fields
	private int z;
	
	public ThreeDimOrderedPair(int xVal, int yVal, int zVal){
			super(xVal,yVal);//always the first line of code in the constructure along with "this"
			z = zVal;
	}
	public ThreeDimOrderedPair(){
		this(0,0,0);
	}
	
	public void setZ(int z){
		this.z=z;
	}
	public int getZ(){
		return z;
	}
	
	public double distanceFrom(OrderedPair p){
		double xDiff = super.getX() - p.getX();
		double yDiff = super.getY() - p.getY();
		double zDiff = this.z - ((ThreeDimOrderedPair)p).getZ();
		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff+ zDiff*zDiff);
	}
	public String toString(){
		return super.toString() + "\nz = " +this.z;
	}
}
