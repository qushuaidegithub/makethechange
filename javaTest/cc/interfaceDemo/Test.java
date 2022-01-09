package com.test.interfaceDemo;

public class Test {

	public static void main(String[] args) {

		IJiao IjiaoDuck = new Duck();// TODO 上溯造型（接口），只能使用对应接口的方法
		IjiaoDuck.jiao();
		IJiao ijPig = new Pig();// 上溯造型（接口），只能使用对应接口的方法
		ijPig.jiao();
		// ijPig.chi();无法调用chi()方法
		IJiao iJiaoLittleDuck = new LittleDuck();// 上溯造型（接口），只能使用对应接口的方法
		iJiaoLittleDuck.jiao();// TODO 子类可以使用父类继承的接口
		// iJiaoLittleDuck.swimming();无法调用swimming()方法
		ISwimming iSwimmingLittleDuck = new LittleDuck();// 上溯造型（接口），只能使用对应接口的方法
		iSwimmingLittleDuck.swimming();
		// iSwimmingLittleDuck.jiao();无法调用jiao()方法

		Duck duck1 = new Duck();
		duck1.jiao();
		Duck duck2 = new LittleDuck();// TODO 上溯造型（父类），只能使用父类的方法
		duck2.jiao();// 只能调用属于Duck的jiao()方法，不可使用子类方法
		Duck duck3 = new ToyDuck();// 上溯造型（父类），只能使用父类的方法
		duck3.jiao();// 只能调用属于Duck的jiao()方法，不可使用子类方法

		LittleDuck littleDuck = new LittleDuck();
		littleDuck.jiao();
		littleDuck.swimming();
		littleDuck.chi();
		ToyDuck toolDuck = new ToyDuck();
		toolDuck.jiao();
		toolDuck.swimming();
		toolDuck.play();

		PetPig petPig = new PetPig();
		petPig.jiao();
		petPig.chi();
		petPig.play();

		IChi iChiPig = new Pig();
		IChi iChiLittleDuck = new LittleDuck();
		iChiPig.chi();
		iChiLittleDuck.chi();

	}

}
