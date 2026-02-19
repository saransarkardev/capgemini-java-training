package comparable_comparator;

import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee - [Name: " + name + ", Salary: " + salary + "]";
    }
}

public class SortEmployee {

    public static List<Employee> sort(List<Employee> emp){
        int n = emp.size();

        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(emp.get(j).salary > emp.get(j+1).salary){

                    Employee temp = emp.get(j);
                    emp.set(j, emp.get(j+1));
                    emp.set(j+1, temp);

                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        return emp;
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Anishka", 400000));
        emp.add(new Employee("Saran", 600000));
        emp.add(new Employee("Arunima", 400000));
        emp.add(new Employee("Rajarshi", 150000));

        sort(emp);
        System.out.println(emp);
    }
}
