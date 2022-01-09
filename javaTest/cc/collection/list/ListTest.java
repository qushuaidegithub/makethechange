package com.test.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// 数组实现，不同步
		ArrayList<String> arrayList = new ArrayList<String>();
		// 数组实现，同步
		Vector<String> vector = new Vector<String>();
		// 链表实现
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//ArrayList、Vector、LinkedList
		//都继承抽象类AbstractList,AbstractList实现List接口
		//AbstractList继承AbstractCollection,AbstractCollection实现List接口
		//List接口继承collection接口

	}

}
