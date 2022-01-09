package com.test.abstractFactory;

public class BMWFactory extends AbstractFactory {
	@Override
	public BMWCar createCar() {
		System.out.println("宝马公司生产=====>");
		return new BMWCar();
	}

	@Override
	public BMWBike createBike() {
		System.out.println("宝马公司生产=====>");
		return new BMWBike();
	}
}
