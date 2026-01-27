package hash_set;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashSet;

public class PrintDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(10,20,30,10,20,40,50,10));
//
//		HashSet<Integer> set = new HashSet<>();
//		
//		ArrayList<Integer> result = new ArrayList<>();
//		
//		for (Integer num : ls) {
//			if (!result.contains(num) && set.contains(num)) {
//				result.add(num);
//			}
//			set.add(num);
//		}
//		
//		System.out.println(result);
		
		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		for (int num : ls) {
			if (!hs1.add(num)) {
				hs2.add(num);
			}
		}
		System.out.println(hs2);
		
		
		
		
		
	}
}
