package tree_set;

import java.util.Comparator;

public class MyMovieComparator implements Comparator<Movie>{
	
	public int compare(Object obj1, Object obj2) {
		
		Movie m1 = (Movie) obj1;
		Movie m2 = (Movie) obj2;
		
		if (m1.rating > m2.rating) {
			return 1;
		}
		else if (m1.rating < m2.rating) {
			return -1;
		}
		return 0;
	}
}
