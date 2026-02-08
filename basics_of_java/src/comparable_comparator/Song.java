package comparable_comparator;


// Comparable interface is present inside java.lang package and Comparable is used to define the natural ordering 
//of objects. A class implements Comparable and overrides compareTo() to tell Java how objects should be sorted.

import java.util.ArrayList;
import java.util.Collections;

import myutility.MyUtils;

public class Song implements Comparable<Song>{
	private String title;
	private String artist;
	private Integer year;
	
	
	public Song(String title, String artist, Integer year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}



	public Integer getYear() {
		return year;
	}



	public void setYear(Integer year) {
		this.year = year;
	}
	

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}
	
	@Override
	public int compareTo(Song anotherSong) {
		
		// Here we are using Integer class compareTo method implementation. (Based on the year) -> ascending order.
//		return this.getYear().compareTo(anotherSong.getYear());
		
		// If we want to sort in descending order...just put a minus before.
		return - this.getYear().compareTo(anotherSong.getYear());
		
		// If we want to write our own compareTo method implementation. (Based on the year) -> ascending order.
//		if (this.getYear() < anotherSong.getYear()) 
//			return -1;
//		else if (this.getYear() > anotherSong.getYear())
//			return +1;
//		else 
//			return 0;
		
		// Here we are using String class compareTo method implementation. (Based on the title) -> ascending order.
//		return this.getTitle().compareTo(anotherSong.getTitle());
		
		// If we want to sort in descending order...just put a minus before.
//		return - this.getTitle().compareTo(anotherSong.getTitle());
	}



	public static void main(String[] args) {
		
        Song song1 = new Song("Shape of You", "Ed Sheeran", 2017);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 2019);
        Song song3 = new Song("Bohemian Rhapsody", "Queen", 1975);
        Song song4 = new Song("Rolling in the Deep", "Adele", 2010);
        Song song5 = new Song("Believer", "Imagine Dragons", 2017);
		
		ArrayList<Song> musicList = new ArrayList<>();
		
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
		
		System.out.println("BEFORE SORTING....");
		MyUtils.iterateList(musicList);
		
//		Collections.sort(musicList);
//		Collections.sort(musicList, new SortByYearComparator());
		Collections.sort(musicList, new SortByArtistNameComparator());
		
		
		System.out.println("AFTER SORTING....");
		MyUtils.iterateList(musicList);
		
	}
}
