package book.cgyms.creationMethod;

public class Test {
	//创建方法
	public static void main(String[] args) {
		Person blackMan = Person.blackMan("日本", "老");
		System.out.println(blackMan.toString());
		Person american = Person.american("白", "女", "中");
		System.out.println(american.toString());

	}
}
