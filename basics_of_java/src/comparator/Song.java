package comparator;

import java.util.ArrayList;

import myutility.MyUtils;

public class Song {
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
		
		MyUtils.iterateList(musicList);
		
		
	}
}
