package book.cgyms.observer;

public class Test {
	public static void main(String[] args) {
		TeamLeader tl = new TeamLeader();
		tl.setTask("开始新的项目");
		tl.addObserver(new MemberA(tl));
		tl.addObserver(new MemberB(tl));
		tl.addObserver(new MemberC(tl));
		tl.releaseTask();
	}
}
