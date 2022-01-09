package book.cgyms.visitor;

public class Test {
	public static void main(String[] args) {
		Visitor teacher = new Teacher();
		Student xiaoHong = new XiaoHong();
		xiaoHong.passOn(teacher);
		System.out.println(teacher.showCheckList());
		Student xiaoMing = new XiaoMing();
		xiaoMing.passOn(teacher);
		System.out.println(teacher.showCheckList());

		Visitor partents = new Parents();
		xiaoHong.passOn(partents);
		System.out.println(partents.showCheckList());
		xiaoMing.passOn(partents);
		System.out.println(partents.showCheckList());

	}
}
