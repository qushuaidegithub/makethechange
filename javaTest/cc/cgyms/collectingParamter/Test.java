package book.cgyms.collectingParamter;

public class Test {
	//收集参数
	//把结果集聚集到一个收集参数中，将它传入被提炼的方法。
	public static void main(String[] args) {
		//sb就是收集参数，通过传入method1-4将结果聚集起来
		StringBuilder sb = new StringBuilder("原始字符串");
		method1(sb);
		method2(sb);
		method3(sb);
		method4(sb);
		System.out.println(sb.toString());
	}

	public static void method1(StringBuilder sb) {
		sb.append("经方法1处理完毕");
	}

	public static void method2(StringBuilder sb) {
		sb.append("经方法2处理完毕");

	}

	public static void method3(StringBuilder sb) {
		sb.append("经方法3处理完毕");

	}

	public static void method4(StringBuilder sb) {
		sb.append("经方法4处理完毕");

	}

}
