package book.cgyms.nullObject;

public class NullMouseEventHandler implements MouseEventHandler {

	@Override
	public boolean mouseUp() {
		System.out.println("null==mouseUp");
		return true;
	}

	@Override
	public boolean mouseDown() {
		System.out.println("null==mouseDown");
		return true;
	}

}
