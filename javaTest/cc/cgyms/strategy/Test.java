package book.cgyms.strategy;

public class Test {

	public static void main(String[] args) {
		//策略的两种提供方式抽象类以及接口
		SunWukong sunwk = new SunWukong(new JinGubang());
		koutouchan(sunwk);
		sunwk.faBao.userFaBao();
		ZhuBajie zhubj = new ZhuBajie(new JiuChidingpa());
		koutouchan(zhubj);
		zhubj.faBao.userFaBao();
		ShaHeshang shahs = new ShaHeshang(new YuJingping());
		koutouchan(shahs);
		shahs.faBao.userFaBao();
	}

	public static void koutouchan(KoutouchanStrategy strategy) {
		strategy.koutouchan();
	}

}
