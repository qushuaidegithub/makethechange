package book.cgyms.strategy;

public class SunWukong extends KoutouchanStrategy {
	public FaBao faBao;

	public SunWukong(FaBao fb) {
		faBao = fb;
		System.out.println("吾乃齐天大圣孙悟空也");
	}

	@Override
	public void koutouchan() {
		System.out.println("妖怪，哪里逃？！");
	}

}
