package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Student{
	private int roll;
	private String name;
	private double percentage;
	
	public Student(int roll, String name, double percentage)  {
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	   public String toString() {
	        return "Roll:" + roll + " Name: "+ name + " Percentage : " +percentage ;
	    }
	
	public static ArrayList<Student> checkStudents(ArrayList<Student> list) {
		
		ArrayList<Student> temp = new ArrayList<>();
		
		for (Student student : list) {
			if (student.percentage > 40.0) {
				temp.add(student);
			}
		}
		
		return temp;
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Saran",59.21));
		students.add(new Student(2,"Anishka",93.56));
		students.add(new Student(3,"Abhishek",85.65));
		students.add(new Student(4,"Rinku",35.65));
		students.add(new Student(5,"Hardik",45.65));
		students.add(new Student(6,"Tilak",65.65));
		students.add(new Student(7,"Virat",96.35));
		students.add(new Student(8,"Rohit",52.45));
		
		
		ArrayList<Student> selectedStudents = checkStudents(students);
		
		
		
		Iterator<Student> it = selectedStudents.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=======================");
		
//		ListIterator<Student> itr = students.listIterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		
		
	}
	
}
