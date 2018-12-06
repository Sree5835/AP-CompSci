
public class TwoDArray {
	public static void main(String[] args){
		System.out.println(ArrayMethods.display(sumCols(fillArray(4,5))));
		System.out.println(ArrayMethods.display(sumRows(fillArray(4,5))));
		
	}
	
	public static int[][] fillArray(int r, int c){
		int[][] a = new int[r][c];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=(i*j)+1;
			}
		}
		return a;
	}
	
	public static int[] sumCols(int[][] table){
		int[] sum = new int[table[0].length];
		
		for(int i = 0;i<table[0].length;i++){
			int num = 0;
			for(int j =0;j<table.length;j++){
				num += table[j][i];
				sum[i] = num;
			}
		}
		return sum;
	}
	
	public static int[] sumRows(int[][] table){
		int[] sum = new int[table.length];
		
		for(int i = 0;i<table.length;i++){
			int num = 0;
			for(int j =0;j<table[0].length;j++){
				num += table[i][j];
				sum[i] = num;
			}
		}
		return sum;
	}
	
}
