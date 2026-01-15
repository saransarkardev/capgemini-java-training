package oops.fundamental.non_static.methods;

public class Test {
	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		person1.name = "Saran";
//		person1.age = 22;
//		person1.gender = "Male";
		
//		person1.initialize("Saran", 22, "Male");
		
		Person person1 = new Person("Saran", 22, "Male");
		person1.display();

		person1.display();
		
		//No argument constructor --> Person()
		Person person2 = new Person();
		person2.name = "Anishka";
		person2.age = 69;
		person2.gender = "Male";
		
		person2.display();
	}
}
