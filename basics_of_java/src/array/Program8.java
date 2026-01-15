package array;

public class Program8 {
	public static void main(String[] args) {
		int[] arr =  {10,20,30};
		int[] ref = demo(arr);
		
		for (int i=0; i<ref.length; i++) {
			System.out.println(ref[i]);
		}
	}
	public static int[] demo(int[] arr) {
		
		int[] temp = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			temp[i] = arr[i]*3;
		}
		
		return temp;
	}
}
