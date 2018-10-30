
public class LoopsWarmUps {
	public static void main(String[] args){
		System.out.println(sumUp(12, 256));
		System.out.println(sumDigits(50249));
		System.out.println(countsh("she sells seashells down by the sea shore. sh"));
		System.out.println(starTriangle(2));
		System.out.println(isPrime(5));
		System.out.println(listPrimes(20));
		
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
	
	public static int countsh(String str){
		int num=0;
		for(int i =0;i<str.length()-1;i++){
			if(str.substring(i, i+2).equals("sh")){
				num++;
			}
		}
		return num;
	}
	
	public static String starTriangle(int num){
		String star="";
		for(int row =0;row<=num;row++){
			for(int col =0;col<row;col++){
				star = star+"*";
			}
			star = star+"\n";
		}
		return star;
	}
	public static boolean isPrime(int num){
		int total=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				total+=i;
			}
		}
		if(total==num+1){
			return true;
		}else{
			return false;
		}
		
		
	}
	public static String listPrimes(int num){
		String all ="";
		for(int i=2; i<=num;i++){
			if(isPrime(i)){
				all+=i+", ";
			}
		}
		return all;
	}
}
