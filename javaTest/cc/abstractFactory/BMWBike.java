package com.test.abstractFactory;

public class BMWBike extends Bike {
	public BMWBike() {
		System.out.println("宝马自行车");
	}

	@Override
	public void run() {
		System.out.println("宝马自行车跑起来");
	}
}
