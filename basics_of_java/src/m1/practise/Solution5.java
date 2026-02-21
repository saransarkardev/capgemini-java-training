package m1.practise;

import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

public class Solution5 {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> {
                if (Double.compare(b.getCGPA(), a.getCGPA()) != 0)
                    return Double.compare(b.getCGPA(), a.getCGPA());   

                if (!a.getName().equals(b.getName()))
                    return a.getName().compareTo(b.getName());       

                return a.getID() - b.getID();                        
            }
        );

        for (String event : events) {

            if (event.startsWith("ENTER")) {
                String[] parts = event.split(" ");
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));
            }
            else { 
                pq.poll();
            }
        }

        List<Student> remaining = new ArrayList<>();

        while (!pq.isEmpty())
            remaining.add(pq.poll());

        return remaining;
    }
}
