package book.cgyms.strategy;

public class ZhuBajie extends KoutouchanStrategy {
	public FaBao faBao;
	
	public ZhuBajie(FaBao fb) {
		faBao = fb;
		System.out.println("俺叫老猪");
	}

	@Override
	public void koutouchan() {
		System.out.println("师傅都被吃了咱就散了吧！");
	}

}
