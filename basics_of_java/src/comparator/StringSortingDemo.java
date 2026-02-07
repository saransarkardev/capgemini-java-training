package comparator;

import java.util.ArrayList;
import java.util.Collections;

import myutility.MyUtils;

public class StringSortingDemo {
	public static void main(String[] args) {
		
		ArrayList<String> musicList = new ArrayList<>();
		
		musicList.add("zara zara");
		musicList.add("besabriyaan");
		musicList.add("kaise hua");
		musicList.add("aeisa desh hai mera");
		musicList.add("koi lauta de woh pyare pyare din");
		
		System.out.println("BEFORE SORTING....");
		MyUtils.iterateList(musicList);
		
		// Sorts the String in the natural order (ascending order)
		Collections.sort(musicList);
		
		System.out.println("AFTER SORTING....");
		MyUtils.iterateList(musicList);
		
		
	}
}
