package book.cgyms.observer;

public class MemberB extends TeamMember {
	TeamLeader teamLeader;

	public MemberB(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}

	@Override
	public void execute() {
		System.out.println("MemberB确认任务：" + teamLeader.getTask());
	}
}
