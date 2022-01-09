package book.cgyms.classReplaceCode;

public class ElevatorState {
	//final限制state一旦初始化则不能再被修改
	private final String state;

	public ElevatorState(String state) {
		this.state = state;
	}
	public String toString() {
		return state;
	}

	public final static ElevatorState OPEN = new ElevatorState("OPEN");
	public final static ElevatorState CLOSE = new ElevatorState("CLOSE");
	public final static ElevatorState OPENTOCLOSE = new ElevatorState(
			"OPENTOCLOSE");
	public final static ElevatorState CLOSETOOPEN = new ElevatorState(
			"CLOSETOOPEN");
	public final static ElevatorState UP = new ElevatorState("UP");
	public final static ElevatorState DOWN = new ElevatorState("DOWN");
}
