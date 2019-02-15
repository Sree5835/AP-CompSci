
public class Bird implements Flier , Comparable<Flier>{

	private double myAltitude;
	private double myTotalDistance;
	private String myFeatherColor;
	
	public Bird(double a, double d,String c){
		myAltitude =a;
		myTotalDistance = d;
		myFeatherColor = c;
	}
	public Bird(){
		this(0,0,"brown");
	}
	public String fly(double distance) {
		myTotalDistance +=distance;
		return "I'm flying "+distance + "miles, SQUAK!";
	}

	public String takeOff() {
		return "Let's FLY, SQUAK!";
	}

	public String land() {
		myAltitude = 0;
		return "Let's get this Bread, SQUAK!";
	}

	public double getAltitude() {
		return myAltitude;
	}

	public double getTotalDistance() {
		return myTotalDistance;
	}
	public void setAltitude(double a){
		myAltitude = a;
	}
	public String getColor(){
		return myFeatherColor;
	}
	//returns positive if this totalDistance > otherFliers' total distance
	//returns negative if this totalDistance < otherFliers' total disatance
	public int compareTo(Flier otherFlier) {
//		if(this.getTotalDistance()>otherFlier.getTotalDistance())
//			return 1;
//		else if(this.getTotalDistance()<otherFlier.getTotalDistance())
//			return -1;
//		else
//			return 0;
		return (int)(this.getTotalDistance()-otherFlier.getTotalDistance());
	}
	
}
