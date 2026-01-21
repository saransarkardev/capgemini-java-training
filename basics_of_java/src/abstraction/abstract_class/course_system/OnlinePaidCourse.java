package abstraction.abstract_class.course_system;

public class OnlinePaidCourse extends OnlineCourse{
	
	double courseFee;
	
	OnlinePaidCourse(String name, double platformCharge, double courseFee) {
		super(name, platformCharge);
		this.courseFee = courseFee;
	}
	
	public void coursePrice() {
		System.out.println("Course price: "+ (courseFee + super.platformCharge) );
	}
}
