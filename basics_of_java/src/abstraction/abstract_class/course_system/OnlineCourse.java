package abstraction.abstract_class.course_system;

public class OnlineCourse extends Course{
	
	double platformCharge;
	
	OnlineCourse(String name, double platformCharge) {
		super(name);
		this.platformCharge = platformCharge;
	}
	
	public void coursePrice() {
		System.out.println("Course price: "+platformCharge);
	}
}
