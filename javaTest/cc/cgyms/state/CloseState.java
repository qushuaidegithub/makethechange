package book.cgyms.state;

public class CloseState extends State {
	public CloseState(String state) {
		super(state);
	}

	@Override
	public void OpenDoor(Elevator elevator) {
		System.out.println("[电梯门关闭]电梯门打开");
		elevator.setState(State.OPEN);
	}

	@Override
	public void CloseDoor(Elevator elevator) {
		System.out.println("[电梯门关闭]");
		elevator.setState(State.CLOSE);
	}

	@Override
	public void Up(Elevator elevator) {
		System.out.println("[电梯门关闭]电梯开始上升");
		elevator.setState(State.UP);
	}

	@Override
	public void Down(Elevator elevator) {
		System.out.println("[电梯门关闭]电梯开始下降");
		elevator.setState(State.DOWN);
	}

}
