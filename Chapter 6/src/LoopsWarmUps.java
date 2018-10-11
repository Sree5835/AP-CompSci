
public class LoopsWarmUps {
	public static void main(String[] args){
		System.out.println(sumUp(12, 256));
		System.out.println(sumDigits(50249));
	}
	public static int sumUp(int num1, int num2){
		int total = 0;
		for(int i=3; i<=num2; i+=3){
			if(i>=num1 && i%5!=0){
				total += i;
			}
		}
		return total;
	}
	public static int sumDigits(int num){
		int total = 0;
		while(num!=0){
			total +=num%10;
			num /= 10;
		}
		return total;
	}
}
