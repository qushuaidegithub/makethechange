package abstractClassDemo;

public abstract class Animal {
	// TODO 抽象方法，子类（或者子类的子类）必须实现
	public abstract void jiao();

	public abstract void chi();

	public abstract void shui();

	// TODO 具体方法，子类不要求必须重写
	public void pao() {
		System.out.println("小动物跑起来……");
	};

	// 抽象类应用之一，模板方法
	public void oneDay() {
		chi();
		shui();
		jiao();
		pao();
	}
}
