package book.cgyms.classReplaceCode;

public class Elevator {
	private String state;
	public final static String OPEN = "OPEN";
	public final static String CLOSE = "CLOSE";
	public final static String OPENTOCLOSE = "OPENTOCLOSE";
	public final static String CLOSETOOPEN = "CLOSETOOPEN";
	public final static String UP = "UP";
	public final static String DOWN = "DOWN";

	public Elevator() {
		this.state = Elevator.CLOSE;
	}

	public String getState() {
		return state;
	}

	public void toOpen() {
		if (state.equals(Elevator.CLOSE)) {
			System.out.println("Elevator电梯开门");
			System.out.println(state = Elevator.CLOSETOOPEN);
			System.out.println(state = Elevator.OPEN);
		} else {
			System.out.println(state + "状态下不可以打开电梯门");
		}
	}

}
