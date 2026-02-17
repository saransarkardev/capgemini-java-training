package comparable_comparator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;



public class JavaComparable{
	public static void main(String[] args) {
		
		Employee[] employees = {
			    new Employee(3, "Steve", "steve@gmail.com", 123456789L, "Male", LocalDate.of(1999, 10, 15), LocalTime.of(2, 10), 5000.00),

			    new Employee(23, "Alice", "alice@gmail.com", 987654321L, "Female", LocalDate.of(1998, 5, 20), LocalTime.of(9, 30), 6200.00),
			    new Employee(3, "Bob", "bob@gmail.com", 912345678L, "Male", LocalDate.of(2000, 1, 10), LocalTime.of(10, 15), 5500.00),
			    new Employee(44, "Charlie", "charlie@gmail.com", 998877665L, "Male", LocalDate.of(1997, 12, 5), LocalTime.of(11, 45), 7000.00),
			    new Employee(5, "Diana", "diana@gmail.com", 889977665L, "Female", LocalDate.of(1996, 3, 18), LocalTime.of(8, 20), 7200.00),
			    new Employee(16, "Ethan", "ethan@gmail.com", 778899665L, "Male", LocalDate.of(1995, 7, 25), LocalTime.of(14, 5), 6800.00),
			    new Employee(7, "Fiona", "fiona@gmail.com", 667788990L, "Female", LocalDate.of(2001, 9, 30), LocalTime.of(16, 40), 5100.00),
			    new Employee(58, "George", "george@gmail.com", 556677889L, "Male", LocalDate.of(1994, 11, 12), LocalTime.of(13, 10), 8000.00),
			    new Employee(39, "Hannah", "hannah@gmail.com", 445566778L, "Female", LocalDate.of(1999, 2, 8), LocalTime.of(15, 55), 5900.00),
			    new Employee(10, "Ian", "ian@gmail.com", 334455667L, "Male", LocalDate.of(1993, 6, 14), LocalTime.of(7, 25), 8200.00),
			    new Employee(141, "Julia", "julia@gmail.com", 223344556L, "Female", LocalDate.of(1998, 4, 22), LocalTime.of(12, 35), 6400.00)
			};
		
		NameComparator nameComparator = new NameComparator();
		

		
		Comparator<Employee> dateOfBirthComparator = new Comparator<Employee>() {
			@Override
		    public int compare(Employee e1, Employee e2) {
		        return e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
		    }
		};
		
//		Comparator<Employee> timeOfBirthComparator = new Comparator<Employee>() {
//			@Override
//		    public int compare(Employee e1, Employee e2) {
//		        return e1.getTimeOfBirth().compareTo(e2.getTimeOfBirth());
//		    }
//		};
		
		// Second way of creating comparator
		Comparator<Employee> timeOfBirthComparator = (Employee e1, Employee e2) -> e1.getTimeOfBirth().compareTo(e1.getTimeOfBirth());
		
		Arrays.sort(employees, dateOfBirthComparator.thenComparing(timeOfBirthComparator));
		
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
