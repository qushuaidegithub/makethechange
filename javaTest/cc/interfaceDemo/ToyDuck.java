package com.test.interfaceDemo;

//可以同时实现多个不同的接口
public class ToyDuck extends Duck implements ISwimming, IPlay {
	public ToyDuck() {
		System.out.println("我是玩具鸭");
	}

	// 可以使用父类实现的接口，即重写
	@Override
	public void jiao() {
		super.jiao();
		System.out.println("嘎嘎嘎……没电了，没法叫了");
	}

	@Override
	public void swimming() {
		System.out.println("玩具鸭游泳");
	}

	@Override
	public void play() {
		System.out.println("玩具鸭可以玩，不可以吃");
	}
}
