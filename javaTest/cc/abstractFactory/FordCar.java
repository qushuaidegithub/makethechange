package com.test.abstractFactory;

public class FordCar extends Car {
	public FordCar() {
		System.out.println("福特汽车");
	}

	@Override
	public void run() {
		System.out.println("宝马汽车跑起来");
	}
}
