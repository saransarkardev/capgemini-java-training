package array;

public class Program9 {
	public static void main(String[] args) {
		int[][] mat = {{1,2},{3,4},{5,6}};
		
		int n = mat.length;
		int m = mat[0].length;
		
		
		for (int i=0; i<n*m; i++) {
			int row = i/m;
			int col = i%m;
			
			System.out.print(mat[row][col] + " ");
		}
//		n=3
//		m =2
//		00 01
//		10 11
//		20 21
	}
}
