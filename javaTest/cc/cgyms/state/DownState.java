package book.cgyms.state;

public class DownState extends State {
	public DownState(String state) {
		super(state);
	}

	@Override
	public void OpenDoor(Elevator elevator) {
		System.out.println("[电梯正在下降中]禁止开门");
		elevator.setState(State.DOWN);
	}

	@Override
	public void CloseDoor(Elevator elevator) {
		System.out.println("[电梯正在下降中]门已关闭");
		elevator.setState(State.DOWN);
	}

	@Override
	public void Up(Elevator elevator) {
		System.out.println("[电梯正在下降中]电梯无法上升");
		elevator.setState(State.DOWN);
	}

	@Override
	public void Down(Elevator elevator) {
		System.out.println("[电梯正在下降中]");
		elevator.setState(State.DOWN);
	}

}
