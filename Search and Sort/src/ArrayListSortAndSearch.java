import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListSortAndSearch
{
	
	//precondition: values is already sorted
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int ArrayListSearch(ArrayList<String> values, String target)
	{
		return values.indexOf(target);
	}
	
	
	//precondition: values is a non-empty ArrayList of Strings
	//postcondition: returns a new ArrayList that is the sorted version of the input parameter
	public static ArrayList<String> bubbleSort(ArrayList<String> values)
	{
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for(int j = 0;j<values.size()-1;j++){
				//comparing values
				if(values.get(j).compareTo(values.get(j+1))>0){
					//switching values;
					String temp = values.get(j);
					values.set(j,values.get(j+1));
					values.set(j+1,temp);
					swapped = true;
				}
			}
		}
		return values;
	}
	
	
	
	public static ArrayList<String> selectionSort(ArrayList<String> values)
	{
		for(int i = 0;i<values.size()-1;i++){
			for(int j = 0;j<values.size()-1-i;j++){

					if(values.get(j).compareTo(values.get(j+1))>0){
					//switching values;
						String temp = values.get(j);
						values.set(j,values.get(j+1));
						values.set(j+1,temp);
					}
				}
			}
		return values;
	}
	

	
	public static ArrayList<String> insertionSort(ArrayList<String> values)
	{
		for(int i=1;i<values.size();i++) {
			String str = values.get(i);
			int j = i-1;
			while(j>=0&&values.get(j).compareTo(str)>0) {
				values.set(j+1,values.get(j));
				j--;
			}
			values.set(j+1,str);
		}
		return values;
	}
	
	
	//use this method to help you test your sorts
	public static boolean isSorted(ArrayList<String> values)
	{
		for(int i = 1; i < values.size(); i++)
		{
			if(values.get(i).compareTo(values.get(i-1)) < 0)
				return false;
		}
		return true;
		
	}
	
	
	
	//use this main method for testing the methods on your own
	public static void main(String[] args)
	{
		String[] sneedsSorting1 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		ArrayList<String> sneedsSorting = new ArrayList<String>(Arrays.asList(sneedsSorting1));
		System.out.println("hi");
		System.out.println(isSorted(insertionSort(sneedsSorting)));
		System.out.println(insertionSort(sneedsSorting));
		
	}
	

	
	

}