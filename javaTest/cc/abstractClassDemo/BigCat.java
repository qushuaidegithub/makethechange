package abstractClassDemo;

public class BigCat extends Cat {
	public BigCat() {
		System.out.println("我是大喵咪……");
	}

	public void oneDay() {
		super.oneDay();
		System.out.println("欺负小猫咪……");
	}
}
