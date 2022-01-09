package com.test.abstractFactory;

public class FordFactory extends AbstractFactory {
	@Override
	public FordCar createCar() {
		System.out.println("福特公司生产=====>");
		return new FordCar();
	}

	@Override
	public FordBike createBike() {
		System.out.println("福特公司生产=====>");
		return new FordBike();
	}
}
