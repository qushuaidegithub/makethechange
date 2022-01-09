package book.cgyms.strategy;

public class ShaHeshang extends KoutouchanStrategy {
	public FaBao faBao;
	
	public ShaHeshang(FaBao fb) {
		faBao = fb;
		System.out.println("我是沙和尚");
	}

	@Override
	public void koutouchan() {
		System.out.println("大师兄，师傅被妖怪抓走了");
	}

}
