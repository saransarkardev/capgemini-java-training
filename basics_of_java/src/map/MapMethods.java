package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "C");
		hm.put(3, "SQL");
		hm.put(4, "rust");
		hm.put(1, "go lang");

		System.out.println(hm);

		System.out.println("get() : " + hm.get(1));

		System.out.println("remove() : " + hm.remove(5));
		System.out.println(hm);

		System.out.println("containsKey() : " + hm.containsKey(4));
		System.out.println("containsValue() : " + hm.containsValue("C#"));

		System.out.println("size() : " + hm.size());

		Set<Integer> keys = hm.keySet();
		System.out.println(keys);

		Collection<String> values = hm.values();
		System.out.println(values);

		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println(hm.replace(4, "mySql"));
		System.out.println(hm);

		System.out.println(hm.remove(1, "go lang"));
		System.out.println(hm);

		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
