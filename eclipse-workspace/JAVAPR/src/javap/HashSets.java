package javap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(123);
		hs.add(456);
		hs.add(123);
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			int i = it.next();
		}
		System.out.println(hs);
	}

}
