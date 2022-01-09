package book.cgyms.classReplaceCode;

public class NewElevator {
	//状态类型为ElevatorState则限制住了state不会被错误输入（只能从ElevatorState类中选择）
	private ElevatorState state;

	public String getState() {
		return state.toString();
	}

	private void setState(ElevatorState state) {
		this.state = state;
	}

	public NewElevator() {
		setState(ElevatorState.CLOSE);
	}

	public void toOpen() {
		System.out.println(getState());
		System.out.println(ElevatorState.CLOSE);
		//TODO ElevatorState.CLOSE即使重写了ElevatorState的toString()方法
		//在使用equals时仍然需要调用toString()才行
		//书中在使用时直接getState().equals(ElevatorState.CLOSE)是不可行的
		if (getState().equals(ElevatorState.CLOSE.toString())) {
			System.out.println("电梯开门");
			System.out.println(state = ElevatorState.CLOSETOOPEN);
			System.out.println(state = ElevatorState.OPEN);
		} else {
			System.out.println(state + "状态下不可以打开电梯门");
		}
	}
}
