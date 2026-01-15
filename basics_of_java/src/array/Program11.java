package array;

public class Program11 {
	public static void main(String[] args) {
		int[][] a = { {7, 9}, {4, 2} };
		int[][] b = { {1, 2}, {6, 5} };
		
		int[][] temp = sum(a,b);
		
		print(temp);
	}
	
	public static void print(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) 
					System.out.print(matrix[i][j]+ " ");
			System.out.println();
		}
	}
	public static int[][] sum(int[][] a, int[][] b) {
		
		int row = a.length;
		int col = a[0].length;
		
		int[][] result = new int[row][col];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				result[i][j] = a[i][j] + a[i][j];
			}
		}
		return result;
	}
	
}
