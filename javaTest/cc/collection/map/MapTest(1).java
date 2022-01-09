package com.test.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// 同步，不允许null，无序
		// hashTable.put(null, null);//运行时会报错
		MapDiffTest("无序",new Hashtable<String, String>());
		// 不同步,允许null，无序
		// hashMap.put(null, null);
		MapDiffTest("无序",new HashMap<String, String>());
		// 有序的HashMap,放入顺序
		MapDiffTest("默认放入顺序",new LinkedHashMap<String, String>());
		// 有序的HashMap,使用顺序
		MapDiffTest("使用顺序",new LinkedHashMap<String, String>(10, 0.6f, true));
		// 有序（支持自定义比较器）
		MapDiffTest("默认顺序",new TreeMap<String, String>());
		// 有比较器的treeMap,根据key值进行比较
		MapDiffTest("自定义比较器倒序",new TreeMap<String, String>(new TestComparator()));

		// Map是接口，AbstractMap,Hashtable实现Map接口
		// HashMap、TreeMap继承抽象类AbstractMap
		// LinkedHashMap继承HashMap
	}

	public static void MapDiffTest(String desc,Map<String, String> map) {
		printClassName(map);
		System.out.println(desc);
		map.put("2", "B");
		map.put("3", "C");
		map.put("1", "A");
		map.put("4", "D");
		map.put("5", "E");
		//map.put(null, null);
		map.get("3");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}

	private static void printClassName(Object obj) {
		String className = obj.getClass().toString();
		System.out.println("======="
				+ className.substring(className.lastIndexOf(".") + 1,
						className.length()) + "=======");
	}
}
