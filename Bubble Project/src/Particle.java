
public class Particle {
	
	private int x;
	private int y;
	private int xvelocity;
	private int yvelocity;
	private int size;
	
	
	public Particle(int x, int y, int xvelocity, int yvelocity, int size){
		this.x = x;
		this.y = y;
		this.xvelocity = xvelocity;
		this.yvelocity = yvelocity;
		this.size = size;
	}
	
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int x){
		this.y = x;
	}
	public void setXVelocity(int x){
		this.xvelocity = x;
	}
	public void setYVelocity(int x){
		this.yvelocity = x;
	}
	public void setSize(int x){
		this.size = x;
	}
	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getXVelocity(){
		return this.xvelocity;
	}
	public int getYVelocity(){
		return this.yvelocity;
	}
	public int getSize(){
		return this.size;
	}
	
}
