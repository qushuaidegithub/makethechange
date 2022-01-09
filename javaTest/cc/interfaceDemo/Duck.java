package com.test.interfaceDemo;

public class Duck implements IJiao {
	public Duck() {
		System.out.println("我代表鸭子");
	}
	@Override
	public void jiao() {
		System.out.println("鸭子都会叫，嘎嘎嘎……");
	}
}
