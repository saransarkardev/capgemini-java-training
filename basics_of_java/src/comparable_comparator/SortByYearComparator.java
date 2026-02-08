package comparable_comparator;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song>{
	
	@Override
	public int compare(Song song, Song anotherSong) {
		
		if (song.getYear() < anotherSong.getYear()) {
			return -1;
		}
		else if (song.getYear() > anotherSong.getYear()) {
			return +1;
		}
		else {
			return 0;
		}
	}
}
