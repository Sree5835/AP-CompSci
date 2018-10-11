
public class Shortcuts {
	public static void main(String[] args)
	{
		int x = 4;
		double y = 2.5;
		
		//shortcut 1
		//set x to x*4
		x = x*4; //x is 16
		x*=4; //shortcut x=x*4; x is now 64
		
		y=y-20; //y is -17.5
		y-=20; //shortcut for y = y-20, y is now -37.5
		
		
		
		//shortcut 2: autoincrements and autodecrements
		//increment x by 1;
		
		x=x+1;  //x is 65;
		x++;//x is 66
		x--;//x is 65
		
		
		//post-increment vs pre-increment
		x++; //post-increment. x is 66
		++x;// pre-increment, x is 67
		
		x=++x -4 - --x+ x++ -2; //x is 62
		
		//now you try
		int a =4;
		int b =22%a;
		
		a = ++b-a-- + 3*++a; //a is 11;b is 3				
	}

}
