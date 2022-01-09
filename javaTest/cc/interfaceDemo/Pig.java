package com.test.interfaceDemo;

public class Pig implements IJiao,IChi {
	public Pig() {
		System.out.println("我代表猪");
	}
	@Override
	public void jiao() {
		System.out.println("猪都会叫，哼哼哼……");
	}
	@Override
	public void chi() {
		System.out.println("猪肉可以吃，很香");
	}
}
