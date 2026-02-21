package m1.practise;


import java.util.*;

class Students {
	private String FirstName;
	private int ID;
	private double CGPA;
	
	public Students(int id, String firstname, double cgpa) {
		this.FirstName = firstname;
		this.ID = id;
		this.CGPA = cgpa;
	}
	
	public String getFirstName() { return FirstName;}
	
	public int getID() { return ID;}
	
	public double getCGPA() { return CGPA;}
	}

public class Solution1 {
	public static void main(String args[]) {
		List<Students> students = new ArrayList<>();
		students.add(new Students(33, "Rumpa", 3.68));
		students.add(new Students(85, "Ashis", 3.85));
		students.add(new Students(56, "Samiha", 3.75));
		students.add(new Students(19, "Samara", 3.75));
		students.add(new Students(22, "Fahim", 3.76));
		
		students.sort((o1,o2)-> {
			if(o2.getCGPA() - o1.getCGPA() > 0) {
				return 1;
			}
			else if(o2.getCGPA() - o1.getCGPA() < 0) {
				return -1;
			}
			else {
				int nameCompare = o1.getFirstName().compareTo(o2.getFirstName());
                if (nameCompare != 0) {
                    return nameCompare;
                } else {
                    return Integer.compare(o1.getID(), o2.getID());
                }
			}
			 
		});
		for (Students s : students) {
            System.out.println(s.getFirstName());
        }
	}
}
