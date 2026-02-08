package comparable;

import java.util.ArrayList;
import java.util.Collections;

import myutility.MyUtils;

public class IntegerSortingDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<>();
		
		integerList.add(15);
		integerList.add(6);
		integerList.add(9);
		integerList.add(3);
		integerList.add(5);
		integerList.add(1);
		
		System.out.println("Before Sorting...");
		MyUtils.iterateList(integerList);
		
		
		// Follows natural order of sorting (ascending order)
		Collections.sort(integerList);
		
		System.out.println();
		System.out.println("After Sorting...");
		MyUtils.iterateList(integerList);
		
		
	}
}
