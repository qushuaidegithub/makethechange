package book.cgyms.nullObject;

public class MainMenuApplet {
	// mouseEventHandler默认NullMouseEventHandler避免null报错
	// NullMouseEventHandler提供null时的方法执行结果
	private MouseEventHandler mouseEventHandler = new NullMouseEventHandler();
	
	public boolean mouseDown() {
		//省去如下代码
		//if (mouseEventHandler != null) {
			return mouseEventHandler.mouseDown();
		//}
		//return true;
	}

	public boolean mouseUp() {
		return mouseEventHandler.mouseUp();
	}
}
