package book.cgyms.state;

public class Test {

	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		elevator.OpenDoor();
		System.out.println(elevator.getState());
		elevator.Up();
		System.out.println(elevator.getState());
		elevator.Down();
		System.out.println(elevator.getState());
		elevator.CloseDoor();
		System.out.println(elevator.getState());
		elevator.Up();
		System.out.println(elevator.getState());
	}

}
