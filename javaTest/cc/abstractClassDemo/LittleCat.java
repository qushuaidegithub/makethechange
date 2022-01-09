package abstractClassDemo;

public class LittleCat extends Cat{
	public LittleCat (){
		System.out.println("我是小猫咪……");
	}
	@Override
	public void chi() {
		System.out.println("小猫吃小鱼……");
	}
}
