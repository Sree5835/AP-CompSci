
public interface Flier {

	//final constant in a class:
	//public static final double GRAVITY_CONSTANT  = 9.8;
	//final constant in an interface:
	double GRAVITY_CONSTANT = 9.8;
	
	String fly(double distance);
	String takeOff();
	String land();
	double getAltitude();
	double getSpeed();
	double getTotalDistance();
	}
