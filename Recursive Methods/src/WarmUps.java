
public class WarmUps {
	
	public static void main(String[] args){
		System.out.println(fib(4));
	}
//	public static int fib(int n){
//		int[] arr = new int[n+1];
//		arr[0]=1; 
//		arr[1]=1;
//		for(int i=2;i<=n;i++){
//			arr[i]=arr[i-1]+arr[i-2];
//		}
//		return arr[n-1];
//	}
	
	public static int fib(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return fib(n-2)+fib(n-1);
		}
	}
}
