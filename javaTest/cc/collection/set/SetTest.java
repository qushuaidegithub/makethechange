package com.test.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		// HashSet、TreeSet继承AbstractSet
		// AbstractSet继承自AbstractCollection并实现Set接口
		// AbstractCollection实现Collection接口
		// LinkedHashSet继承自HashSet
		// Set内部由Map实现
		// HashSet--HashMap
		// LinkedHashSet--LinkedHashMap
		// TreeSet--TreeMap
	}

}
