package book.cgyms.state;

public class Elevator {
	private State state;

	public Elevator() {
		this.setState(State.CLOSE);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void OpenDoor() {
		this.state.OpenDoor(this);
	}

	public void CloseDoor() {
		this.state.CloseDoor(this);
	}

	public void Up() {
		this.state.Up(this);
	}

	public void Down() {
		this.state.Down(this);
	}

}
