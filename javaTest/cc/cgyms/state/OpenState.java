package book.cgyms.state;

public class OpenState extends State {
	public OpenState(String state) {
		super(state);
	}

	@Override
	public void OpenDoor(Elevator elevator) {
		System.out.println("[电梯门敞开]");
		elevator.setState(State.OPEN);
	}

	@Override
	public void CloseDoor(Elevator elevator) {
		System.out.println("[电梯门敞开]电梯门关闭");
		elevator.setState(State.CLOSE);
	}

	@Override
	public void Up(Elevator elevator) {
		System.out.println("[电梯门敞开]电梯无法上升");
		elevator.setState(State.OPEN);
	}

	@Override
	public void Down(Elevator elevator) {
		System.out.println("[电梯门敞开]电梯无法下降");
		elevator.setState(State.OPEN);
	}

}
