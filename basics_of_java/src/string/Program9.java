package string;

public class Program9 {
	public static void main(String[] args) {
		
		System.out.println("83456".matches("[6-9]\\d+"));
		System.out.println("94930383456".matches("[6-9]\\d+"));
		System.out.println("94930383456".matches("[6-9]\\d{9}"));
		System.out.println("94930383456".matches("[6-9]\\d{9,}"));
		System.out.println("94930383456".matches("[6-9]\\d{9}"));
		
		
	}
}
