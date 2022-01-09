package book.cgyms.chainConstructor;

public class Test {
	// 链构造函数
	public static void main(String[] args) {
		Person p = new Person("黑");
		System.out.println(p.toString());
		Person p1 = new Person("白", "意大利", "女", "中");
		System.out.println(p1.toString());
	}
}
