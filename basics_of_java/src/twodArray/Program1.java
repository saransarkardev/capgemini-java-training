package twodArray;

public class Program1 {

	public static void main(String[] args) {
		
		int[][] a = {{100,4},{200,3}};
		
		// Here a[0] will return us the object reference of first array {100,4}
		// Here a[1] will return us the object reference of second array {200,3}
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		// Outer loop is to iterate each array
		for (int i=0; i<a.length; i++) {
			// inner loop is to iterate each elements
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

System.out.println("static block 1");
System.out.println("static block 2");
System.out.println("non-static block 1");
System.out.println("demo()");
System.out.println("non-static block 2");
System.out.println("Program1()");
System.out.println("non-static block 1");
System.out.println("demo()");
System.out.println("non-static block 2");
System.out.println("Program1(int a)");
