package abstraction.abstract_class.course_system;

public class Test {
	public static void main(String[] args) {
		
		Course c1 = new OnlineCourse("Java", 1000.0);
		c1.courseInfo();
		c1.coursePrice();

		
		Course c2 = new OnlinePaidCourse("C++", 1000.0, 2000.0);
		c1.courseInfo();
		c2.coursePrice();
	}
}
