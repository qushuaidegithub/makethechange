package book.cgyms.visitor;

public class XiaoHong implements Student {
	private String name = "小红";

	@Override
	public void passOn(Visitor visitor) {
		visitor.check(this);
	}

	public String getName() {
		return name;
	}

}
