package book.cgyms.nullObject;

public class NavigationApplet {
	// mouseEventHandler默认NullMouseEventHandler避免null报错
	// NullMouseEventHandler提供null时的方法执行结果
	private MouseEventHandler mouseEventHandler = new NullMouseEventHandler();

	public boolean mouseDown() {
		return mouseEventHandler.mouseDown();
	}

	public boolean mouseUp() {
		return mouseEventHandler.mouseUp();
	}
}
