
public class WarmupMethods {
	public static void main (String[] args){
		System.out.println(luckyNumber(18));
		System.out.println(coolNumber(134));
		System.out.println(alphabetize("zebra apple"));
		System.out.println(reportCard(89.99));
		//short circuiting
		System.out.println((45%5 ==2) && (3/0==0));
		//This expression always returns false because 45 mod 5 isn't 2, so the computer doesn't even get to the second
		//part to show a run time error.
		
		
	}
	public static boolean luckyNumber(int x){
		return ((x%2==0)||(x%3==0)) && !(x%6==0);
	}
	public static boolean coolNumber(int x){
		return (x>=100 && x<=1000) && (((x/10)%10)==7);
	}
	public static String alphabetize(String word){
		int wordLenght = word.length();
		int spaceNum = word.indexOf(" ");
		String word1 = word.substring(0,spaceNum);
		String word2 = word.substring(spaceNum+1, wordLenght);
		char L1 = word1.charAt(0);
		char L2 = word2.charAt(0);
		if(L1<L2){
			return word1+ " "+word2;
		}else{
			return word2+ " "+word1;
		}
		
	}
	public static String reportCard(double percent){
		if(percent>=0&&percent<60){
		return "F";
		}else if(percent>=0&&percent<60){
			return "F";
		}else if(percent>=60&&percent<70){
			return "D";
		}else if(percent>=70&&percent<80){
			return "C";
		}else if(percent>=80&&percent<90){
			return "B";
		}else if(percent>=90&&percent<=100){
			return "A";
		}else{
			return "No Grade";
		}
	}
}
