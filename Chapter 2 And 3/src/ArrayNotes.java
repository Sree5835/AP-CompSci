import java.awt.Rectangle;
import java.util.ArrayList;

public class ArrayNotes {
	public static void main(String[] args){
		//declare an array of 10 ints
		int[] numbers =  new int[10];
		
		//assign the array to 1,3,5,7, ... ,19
		//first way:
		numbers[0]=1;
		numbers[1]=3;
		
		//second way:
		int[] numbers2 = {1,3,5,7,9,11,13,15,17,19};
		
		//third way: most common way
		for(int i=0;i<numbers2.length;i++){
			numbers[i]= i+i+1;
		}
		
		//now YOU try...
		//declare and fill an array of length 30,
		//with values 0,3,8,15,,24,35,48,...,899
		
		int[] numbers3 = new int[30];
		
		for(int i =0;i<numbers3.length;i++){
			numbers3[i] = (2+i)*i;
		}
		System.out.println(numbers3[29]);
		
		//create an array of 100 rectangle objects
		//all of them are centered at (0,0)
		//1x1,2x2,3x3,...,100x100
		
		Rectangle[] rect = new Rectangle[100];
		for(int i=0;i<rect.length;i++){
			rect[i] = new Rectangle((i+1),(i+1));
		}
		
		//Declaring and instantiating an ArrayList:
		//ArrayList<ClassName> variableName = 
		//new ArrayList<ClassName>();
		ArrayList<String> words = new ArrayList<String>();
		words.add("Ameya");
		words.add("Echols");
		words.add("Izzo");
		
		//the .remove() method removes the object from the ArrayList.
		words.remove("Echols");
		//using primitive
		Integer x = new Integer(3);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(x);
		
		
		//traversing an ArrayList 
		for(int i=0;i<words.size();i++){
			System.out.println(words.get(i));
		}
		
		// this uses an advancd method: the for each loop.
		for(String s:words){
			System.out.println(s);
		}
	}
	
	public static int[] addSlot(int[] numbers, int index, int value){
		int[] a = new int[numbers.length+1];
		for(int i=0;i<index;i++){
			a[i]=numbers[i];
		}
		a[index]=value;
		for(int i=index+1;i<numbers.length+1;i++){
			a[i]=numbers[i-1];
		}
		return a;
	}
}
