package book.cgyms.visitor;

public class XiaoMing implements Student {
	private String name = "小明";

	@Override
	public void passOn(Visitor visitor) {
		visitor.check(this);
	}

	public String getName() {
		return name;
	}
}
