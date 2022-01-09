package book.cgyms.decorator;

public class Test {
	// 装饰器并不改变原先的操作习惯
	// 所以装饰器需要和被装饰的对象实现同一个接口（可以保持相同的类型声明及调用同名方法）
	// 装饰器内持有一个对被装饰对象的引用（上溯造型为公共接口），通过构造函数进行组合

	public static void main(String[] args) {
		Car car = new Car("黑色", "京A88888");
		System.out.println(car);

		IPrintCar normalPrint = new NormalPrint(car);// 普通
		normalPrint.printCarColor("红色");
		System.out.println(car);

		IPrintCar topPrint = new TopPrint(new NormalPrint(car));// 装饰，TopPrint为装饰器
		topPrint.printCarColor("红色");
		System.out.println(car);

	}
}
