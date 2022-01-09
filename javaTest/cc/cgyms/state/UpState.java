package book.cgyms.state;

public class UpState extends State {
	public UpState(String state) {
		super(state);
	}

	@Override
	public void OpenDoor(Elevator elevator) {
		System.out.println("[上升过程中]禁止开门");
		elevator.setState(State.UP);
	}

	@Override
	public void CloseDoor(Elevator elevator) {
		System.out.println("[上升过程中]门已关闭");
		elevator.setState(State.UP);
	}

	@Override
	public void Up(Elevator elevator) {
		System.out.println("[上升过程中]电梯正在上升中");
		elevator.setState(State.UP);
	}

	@Override
	public void Down(Elevator elevator) {
		System.out.println("[上升过程中]电梯无法下降");
		elevator.setState(State.UP);
	}

}
