package book.cgyms.observer;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
	private List<TeamMember> members;

	private String task;

	public TeamLeader() {
		this.members = new ArrayList<TeamMember>();
	}

	public void releaseTask() {
		System.out.println("TeamLeader发布任务：");
		for (TeamMember member : members) {
			member.execute();
		}
	}

	public void addObserver(TeamMember member) {
		this.members.add(member);
	}

	public void addObservers(List<TeamMember> members) {
		this.members.addAll(members);
	}

	public void delObserver(TeamMember member) {
		this.members.remove(member);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
