
public class ComplexNumber {
	private double num;
	private double i = Math.sqrt(-1);
	private int a;
	private int b;
	
	//constructor
	public ComplexNumber(int a, int b){
		num = a + (b*i);
		this.a = a;
		this.b = b;
	}
	
	//add
	public ComplexNumber add(ComplexNumber cNum){
		int a1 = a+cNum.getA();
		int b1 = b+cNum.getB();
		return new ComplexNumber(a1 , b1);
	}
	
	//multiply
	public ComplexNumber multiply(ComplexNumber cNum){
		int a1 = ((a*cNum.getA()) + ((-1)*cNum.getB()*b));
		int b1 = (a*(cNum.getB())) + (b*cNum.getA());
		return new ComplexNumber(a1 , b1);
	}
	
	
	//acccessors
	public int getA(){
		return a; 
	}
	public int getB(){
		return b;
	}
	
	public String toString(){
		return ""+a+  " + " +b + "i";
	}
}
