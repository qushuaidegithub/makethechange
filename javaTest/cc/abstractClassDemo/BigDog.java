package abstractClassDemo;

public class BigDog extends Dog{
	@Override
	public void chi() {
		System.out.println("大狗啃骨头……");
	}
	@Override
	public void shui() {
		System.out.println("大狗睡地板……");
	}

	// 重写父类具体方法
	public void oneDay(){
		System.out.println("大狗的一天：");
		chi();
		shui();
		System.out.println("看见护院，做人民的好卫士……");
	}
}
