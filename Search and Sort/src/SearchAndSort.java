public class SearchAndSort
{
	public void Main(String[] args){
		
	}
	//precondition: values is a non-empty array of integers
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int linearSearch(int[] values, int target)
	{
		for(int i = 0; i<values.length; i++){
			if(values[i] == target){
				return i;
			}
		}
		return -1;
		
	}
	
	//overloaded for String arrays
	public static int linearSearch(String[] values, String target)
	{
		for(int i = 0; i<values.length; i++){
			if(values[i].equals(target)){
				return i;
			}
		}
		return -1;
		
	}
	
	//precondition: values is already sorted
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int binarySearch(int[] values, int target)
	{
		while(1==1){
		int f = 0;
		int l = values.length;
		int m = (f+l)/2;
		if(f>l){
			return -1;
		}
		if(target > values[m]){
			f = m+1;
		}else if(target < values[m]){
			l=m-1;
		}else{
			return m;
		}
		}
	}
	
	//String version
	public static int binarySearch(String[] values, String target)
	{
		while(1==1){
			int f = 0;
			int l = values.length;
			int m = (f+l)/2;
			if(f>l){
				return -1;
			}
			if(target.compareTo(values[m])>0){
				f = m+1;
			}else if(target.compareTo(values[m])<0){
				l=m-1;
			}else{
				return m;
			}
			}
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] bubbleSort(int[] values)
	{
		boolean swapped = true;
		int temp;
		
		while(swapped){
			swapped = false;
			for(int i = 0; i< values.length-1;i++){
				temp=values[i];
				values[i]=values[i+1];
				values[i+1]=temp;
				swapped=true;
			}
		}
		return values;
		
	}
	
	//String version
	public static String[] bubbleSort(String[] values)
	{
		boolean swapped = true;
		String temp;
		
		while(swapped){
			swapped = false;
			for(int i = 0; i< values.length-1;i++){
				temp=values[i];
				values[i]=values[i+1];
				values[i+1]=temp;
				swapped=true;
			}
		}
		return values;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] selectionSort(int[] values)
	{
		int temp;
		while(1==1){
		for(int i=0;i<values.length;i++){
			
		}
		return values;
		}
	}
	
	//String version
	public static String[] selectionSort(String[] values)
	{
		
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] insertionSort(int[] values)
	{
		int j;
		int temp;
		for(j = 1;j<values.length;j++){
			if(values[j]<values[j-1]){
				temp = values[j];
					for(int i=j-1;i>0;i--){
						if(i>0){
							values[i] = values[i-1];
						}
						if(values[i-1]<temp){
							values[i]=temp;
						}	
					}
			}
		}
		return values;
	}
	
	//String version
	public static String[] insertionSort(String[] values)
	{
		
	}
	
	private static boolean isSorted(int[] values){
		 for(int i=0;i<values.length-1;i++){
			 if(values[i]>values[i+1]){
				 return false;
			 }
		 }
		 return true;
	 }
	
}