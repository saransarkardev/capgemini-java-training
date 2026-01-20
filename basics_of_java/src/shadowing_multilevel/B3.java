package shadowing_multilevel;

public class B3 extends B2{
	int a = 30;
	
	public void print() {
		System.out.println("In class B3");
	}
	
	public void display() {
		
		System.out.println(a);
		System.out.println(super.a);
		
		System.out.println(((B1)this).a); // Here it is doing up casting 
	}
	
	public void displayPrint() {
		print();
		super.print();
		((B1)this).print();
	}
	
	public static void main(String[] args) {
		
		B3 b3 = new B3();
		b3.display();
		b3.displayPrint();
		
	}
}
