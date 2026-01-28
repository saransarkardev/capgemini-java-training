package tree_set;

import java.util.TreeSet;

public class Movie{
	int id;
	String name;
	double rating;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	
	public Movie(int id, String name, double rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "{Id: "+id+ ", Name: "+name+", Rating: "+rating+"}";
	}
	
	
	public static void main(String[] args) {
		
		TreeSet<Movie> set = new TreeSet<Movie>(new MyMovieComparator());
		
		Movie m1 = new Movie(1, "Inception", 8.8f);
		Movie m2 = new Movie(2, "Interstellar", 8.6f);
		Movie m3 = new Movie(3, "Avatar", 7.8f);
		Movie m4 = new Movie(3, "The Dark Knight", 8.8f);
		
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		
		System.out.println(set);

		
	}
}
