import java.util.Scanner;

public class Hello
{  
	public static void main(String[] args)
	{
		System.out.println("Hello!");
		//this is my first program.
//		Scanner reader = new Scanner(System.in);
//		userName = reader
//		System.out.println(reader);
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("What is your name: ");
		String userName = reader.next(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		System.out.println("It's nice to meet you, " + userName);
	}
}
