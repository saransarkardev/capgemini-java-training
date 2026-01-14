package oops.fundamental.non_static.methods;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student;
		s1.id = 4;
		s1.name = "Anishka";
		s1.percentage = 98.25;
		
		s1.display();
		
		Student s2 = new Student(1,"Saran",99.99);
		s2.display();
	}
}
