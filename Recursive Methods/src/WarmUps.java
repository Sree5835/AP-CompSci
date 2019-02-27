
public class WarmUps {
	
	public static void main(String[] args){
		System.out.println(fib(4));
		System.out.println(reverse("hello!"));
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
		if(n<=2)
			return 1;
		return fib(n-2)+fib(n-1);
	}
	
	public static String reverse(String s){
		if(s.length()==1){
			return s;
		}
		return s.substring(s.length()-1, s.length()) + reverse(s.substring(0, s.length()-1));
	}
}
