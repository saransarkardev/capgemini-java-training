package assignments.Day4;

/*
 	Write a program to determine whether a given 2D matrix is sparse or not. 
 	A sparse matrix is one where the majority of its elements are zero. 
 	If the count of zero elements is greater than the count of non-zero elements, 
 	the matrix is considered sparse. Otherwise, it is not considered sparse.
 */

public class Program1 {
	public static boolean checkSparseMatrix(int[][] matrix) {
		
		int zeroCount = 0, nonZeroCount = 0;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == 0) 
					zeroCount++;
				else 
					nonZeroCount++;
			}
		}
		
		return zeroCount > nonZeroCount ? true : false;
	}
	public static void main(String[] args) {
		int[][] matrix = { {0,1,0}, {2,0,2}, {0,0,5} };
		
		if (checkSparseMatrix(matrix) == true) {
			System.out.println("Sparse Matrix");
		}
		else {
			System.out.println("Not a Sparse Matrix");
		}
		
	}
}
