package flowControlStatement.Decision_statement;

public class Program5 {
	 public static void main(String[] args) {
		byte b = 1;
		switch(b) {  // byte, short, int, char, String , Enum --> we can take input as these datatypes.
			
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("2");
				break;
			default: // this block can be placed anywhere.
				System.out.println("Default");
		}
	}
}
