package abstractClassDemo;

public class LittleDog extends Dog {
	// Dog-LittleDog将Animal所有抽象类都实现完成，所以本类可以是具体类
	@Override
	public void chi() {
		System.out.println("小狗要吃奶……");
	}

	@Override
	public void shui() {
		System.out.println("小狗睡床垫……");
	}

	// 可以重写父类的具体方法
	@Override
	public void pao() {
		super.pao();
		System.out.println("小狗跑得慢");
	}
}
