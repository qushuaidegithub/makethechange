package abstractClassDemo;

public class Test {

	public static void main(String[] args) {
		// Animal dog = new Dog();//TODO 抽象类不能被实例化
		Animal bigDog = new BigDog();
		bigDog.oneDay();
		Animal littleDog = new LittleDog();
		littleDog.oneDay();
		Animal cat = new Cat();
		cat.oneDay();
		Animal bigCat = new BigCat();
		bigCat.oneDay();
		Animal littleCat = new LittleCat();
		littleCat.oneDay();
	}

}
