package com.test.interfaceDemo;

public class LittleDuck extends Duck implements ISwimming, IChi {
	public LittleDuck() {
		System.out.println("我是小鸭子");
	}

	// 不需要实现父类接口的IJiao方法
	@Override
	public void swimming() {
		System.out.println("小鸭子游泳");
	}

	@Override
	public void chi() {
		System.out.println("小鸭子可以吃，不可以玩");
	}
}
