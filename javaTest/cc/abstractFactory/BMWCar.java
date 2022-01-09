package com.test.abstractFactory;

public class BMWCar extends Car {
	public BMWCar() {
		System.out.println("宝马汽车");
	}

	@Override
	public void run() {
		System.out.println("宝马汽车跑起来");
	}
}
