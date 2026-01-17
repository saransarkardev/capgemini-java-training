package inheritance;

public class Nephrologist extends Doctor{

	public void dylasis() {
		System.out.println("dylasis");
	}
	
	public static void main(String[] args) {
		
		Nephrologist obj = new Nephrologist();

		System.out.println(obj.degree);
		System.out.println(obj.name);
		obj.checkBp();
		obj.checkTemp();
		obj.dylasis();
		
	}
}