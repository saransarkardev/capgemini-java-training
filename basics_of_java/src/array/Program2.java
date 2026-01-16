package array;

public class Program2 {
	public static void main(String[] args) {
		// {1,2,3} object is created in heap memory in a contigous manner.
		// Then a object reference is returned and we stored the reference in a variable.
		// The object reference will be [I@hexaDecimal, ( [ for array, I for int type)
		int[] a = {1,2,3};
		System.out.println(a);
		
		// we can store int type in double (widening)
		double[] d = {4.5,2.7,1.8,1};
		System.out.println(d);
		
		String[] s = {"A","B"};
		System.out.println(s);
		
		
		Student[] student = {new Student(), new Student(), null};
		
		System.out.println(student);
		
//		Employee[] emp = {new Employee(), new Employee()};
		System.out.println();
	}
}
