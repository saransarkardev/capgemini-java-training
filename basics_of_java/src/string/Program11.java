package string;

public class Program11 {
	public static void main(String[] args) {
		
		String s = "java!w#qse(";
		
//		String s1[] = s.split("[!#(]");
		String s1[] = s.split("[^A-Za-z0-9]+");
		for(int i=0; i<s1.length; i++)
			System.out.println(s1[i]);
	}
}
