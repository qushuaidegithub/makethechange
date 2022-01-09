package com.test.collection.map;

import java.util.Comparator;

public class TestComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
			return -1;
		} else if (Integer.parseInt(s1) < Integer.parseInt(s2)) {
			return 1;
		} else {
			return 0;
		}
		//return s1.compareTo(s2);
	}
}
