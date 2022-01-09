package book.cgyms.state;

public interface IElevator {
	public void OpenDoor(Elevator elevator);

	public void CloseDoor(Elevator elevator);

	public void Up(Elevator elevator);

	public void Down(Elevator elevator);
}
