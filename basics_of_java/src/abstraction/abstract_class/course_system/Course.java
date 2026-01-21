package abstraction.abstract_class.course_system;

public abstract class Course {
	
	String name;
	
	Course(String name) {
		this.name = name;
	}
	
	public void courseInfo() {
		System.out.println("Course Name: "+name);
	}
	
	public abstract void coursePrice();
	
}
