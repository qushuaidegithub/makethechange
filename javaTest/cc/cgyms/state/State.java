package book.cgyms.state;

public abstract class State implements IElevator {
	private String state;

	public State(String state) {
		this.state = state;
	}

	public String toString() {
		return state;
	}

	public final static State OPEN = new OpenState("OPEN");
	public final static State CLOSE = new CloseState("CLOSE");
	public final static State UP = new UpState("UP");
	public final static State DOWN = new DownState("DOWN");

}
