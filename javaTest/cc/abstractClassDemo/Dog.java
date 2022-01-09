package abstractClassDemo;

public abstract class Dog extends Animal {
	// TODO 实现父类一个抽象方法，因未能全部实现父类所有抽象方法，所以本类必须声明为抽象的
	@Override
	public void jiao() {
		System.out.println("汪汪汪……");
	}

	public void oneDay() {
		System.out.println("汪星人的一天：");
		super.oneDay();
	}

}
