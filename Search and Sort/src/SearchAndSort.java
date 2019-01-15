public class SearchAndSort
{
//	public void Main(String[] args){
//		int[] values = {-3, -1, 4, 6, 11, 16, 22, 42, 50, 51, 61, 75, 80, 89, 203, 514, 719, 1012};
//		System.out.println("3 tests for binary search:");
//		System.out.print((binarySearch(values, 203)==14) + ", ");
//		System.out.print((binarySearch(values, -3)==0) + ", ");
//		System.out.print(binarySearch(values, 1013)==-1); //1013 is not in the array, so linearSearch should return -1
//		System.out.println("\n");
//	}
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
		int start = 0;
        int end = values.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == values[mid]) {
                return mid;
            }
            if (target < values[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
	}
	
	//String version
	public static int binarySearch(String[] values, String target)
	{
		int start = 0;
        int end = values.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target.equals(values[mid])) {
                return mid;
            }
            if (target.compareTo(values[mid])<0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] bubbleSort(int[] values)
	{
        for (int i = 0; i < values.length-1; i++) {
            for (int j = 0; j < values.length-i-1; j++) {
                if (values[j] > values[j+1]) 
                { 
                	//swapping
                    int temp = values[j]; 
                    values[j] = values[j+1]; 
                    values[j+1] = temp; 
                } 
            }
        }
		return values;
	}
	
	//String version
	public static String[] bubbleSort(String[] values)
	{
		int n = values.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (values[j].compareTo(values[j+1])>0) 
                { 
                    String temp = values[j]; 
                    values[j] = values[j+1]; 
                    values[j+1] = temp; 
                } 
		return values;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] selectionSort(int[] values)
	{
		int temp;
		for(int i=0;i<values.length-1;i++) {
			int minIndex = i;
			for (int j = i+1; j < values.length; j++) {
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
			}
			temp = values[i];
			values[i]=values[minIndex];
			values[minIndex]=temp;
		}
		return values;
	}
	
	//String version
	public static String[] selectionSort(String[] values)
	{
		String temp;
		for(int i=0;i<values.length-1;i++) {
			int minIndex = i;
			for (int j = i+1; j < values.length; j++) {
                if (values[j].compareTo(values[minIndex])<0) {
                    minIndex = j;
                }
			}
			temp = values[i];
			values[i]=values[minIndex];
			values[minIndex]=temp;
		}
		return values;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] insertionSort(int[] values)
	{
		for(int i=1;i<values.length;i++) {
			int num = values[i];
			int j = i-1;
			while(j>=0&&values[j]>num) {
				values[j+1]=values[j];
				j--;
			}
			values[j+1]=num;
		}
		return values;
	}
	
	//String version
	public static String[] insertionSort(String[] values)
	{
		for(int i=1;i<values.length;i++) {
			String num = values[i];
			int j = i-1;
			while(j>=0&&values[j].compareTo(num)>0) {
				values[j+1]=values[j];
				j--;
			}
			values[j+1]=num;
		}
		return values;
	}
	
}