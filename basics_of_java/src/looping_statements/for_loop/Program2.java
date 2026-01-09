package looping_statements.for_loop;

public class Program2 {
	public static void main(String[] args) {
		int n = 7;
		boolean flag = true;
		for (int i=2; i*i<=n; i++) {
			if (n%i == 0) {
				flag = false;
				break;
			}
		}
		
		if (flag == true) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}

//0-> open
//1 -> close
//1 2 3 4 5 6 7 8 9 10
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 -> 1
//1 0 1 0 1 0 1 0 1 0 -> 2
//1 0 0 0 1 1 1 0 0 0 -> 3
//1 0 0 1 1 1 1 1 0 0 -> 4
//1 0 0 1 0 1 1 1 0 1 -> 5
//1 0 0 1 0 0 1 1 0 1 -> 6
//1 0 0 1 0 0 0 1 0 1 -> 7
//1 0 0 1 0 0 0 0 0 1 -> 8
//1 0 0 1 0 0 0 0 1 0 -> 9
//1 0 0 1 0 0 0 0 1 1 -> 10
 