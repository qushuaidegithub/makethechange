package book.cgyms.observer;

public class MemberA extends TeamMember {
	TeamLeader teamLeader;

	public MemberA(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}

	@Override
	public void execute() {
		System.out.println("MemberA确认任务：" + teamLeader.getTask());
	}
}
