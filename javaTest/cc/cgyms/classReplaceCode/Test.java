package book.cgyms.classReplaceCode;

public class Test {
	//使用类代替类型代码
	public static void main(String[] args) {
		//使用类型代码
		Elevator elevator = new Elevator();
		elevator.toOpen();
		//使用类
		//把字段的类型声明为类，从而限制赋值和等同性比较
		NewElevator newElevator = new NewElevator();
		newElevator.toOpen();

	}

}
