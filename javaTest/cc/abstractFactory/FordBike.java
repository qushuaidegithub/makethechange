package com.test.abstractFactory;

public class FordBike extends Bike{
	public FordBike(){
		System.out.println("福特自行车");
	}
	@Override
	public void run() {
		System.out.println("福特自行车跑起来");
	}
}
