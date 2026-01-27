package tree_set;

import java.util.TreeSet;

public class Movie {
	int id;
	String name;
	double rating;
	
	public Movie(int id, String name, double rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	public static void main(String[] args) {
		
		Movie m1 = new Movie(1, "War", 5.5);
		Movie m2 = new Movie(24, "Krish", 8.5);
		Movie m3 = new Movie(3, "Sultan", 6.5);
		Movie m4 = new Movie(29, "Gandu", 9.5);
		
		TreeSet<Movie> ts = new TreeSet<>(new MyMovieComparator());
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		
		System.out.println(ts);
		
	}
}
