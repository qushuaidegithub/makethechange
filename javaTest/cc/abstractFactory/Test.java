package com.test.abstractFactory;

public class Test {

	public static void main(String[] args) {
		// 不同的工厂轻松切换，生产不同的产品族
		// 福特工厂生产福特汽车、福特自行车
		// 宝马工厂生产宝马汽车、宝马自行车
		// AbstractFactory abstractFactory = new FordFactory();
		AbstractFactory abstractFactory = new BMWFactory();
		createCar(abstractFactory).run();
		createBike(abstractFactory).run();

	}

	public static Car createCar(AbstractFactory abstractFactory) {
		return abstractFactory.createCar();
	}

	public static Bike createBike(AbstractFactory abstractFactory) {
		return abstractFactory.createBike();
	}

}
