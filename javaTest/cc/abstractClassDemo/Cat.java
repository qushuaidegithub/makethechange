package abstractClassDemo;

public class Cat extends Animal {
	// 与Dog类不同，Cat直接实现了父类所有的抽象方法，所以可以直接声明为具体类
	@Override
	public void chi() {
		System.out.println("猫爱吃鱼……");
	};

	@Override
	public void jiao() {
		System.out.println("喵喵喵……");
	}

	@Override
	public void shui() {
		System.out.println("白天睡大觉……");
	}

	public void oneDay() {
		System.out.println("猫咪的一天：");
		super.oneDay();
	}
}
