package book.cgyms.observer;

public class MemberC extends TeamMember {
	TeamLeader teamLeader;

	public MemberC(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}

	@Override
	public void execute() {
		System.out.println("MemberC确认任务：" + teamLeader.getTask());
	}
}
