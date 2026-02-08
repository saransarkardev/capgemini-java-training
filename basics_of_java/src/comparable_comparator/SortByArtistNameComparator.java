package comparable_comparator;

import java.util.Comparator;

public class SortByArtistNameComparator implements Comparator<Song>{
	
	@Override
	public int compare(Song song, Song anotherSong) {
		// descending order.
		return - song.getArtist().compareTo(anotherSong.getArtist());
 	}
}
