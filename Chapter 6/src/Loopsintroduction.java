
public class Loopsintroduction {

	public static void main(String[] args){
		//example 1: output "Hello World" 20 times
		for(int i=0; i<20;i++){
			System.out.println("Hello World");
		}
		//example 2: add all #s 1-30 (inclusive) and return i at the end
		int total =0;
		int i=0;
		for(i =1; i<31; i++){
			total += i; 
		}
		System.out.println(total);
		//return i; this line would go right after the for loop
		
		//example 3: add up all the ODD numbers from 9 to 51 (inclusive). Print the total result
		
		int total2 = 0;
		for(int num = 9; num >=51; num+=2){
			total2 +=num;
		}
		System.out.println(total2);
		
	}
}