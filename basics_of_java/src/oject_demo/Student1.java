package oject_demo;

public class Student1 {
	
	String name;
	String email;
	String phone;
	
	public Student1(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Employee1) {
			Employee1 e = (Employee1)obj;
			if (this.email == e.email || this.phone == e.phone) {
				return true;
			}
		}
		else if (obj instanceof Student1) {
			Student
		}
	}
}
