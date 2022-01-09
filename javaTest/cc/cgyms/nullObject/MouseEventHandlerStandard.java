package book.cgyms.nullObject;

public class MouseEventHandlerStandard implements MouseEventHandler {
	@Override
	public boolean mouseUp() {
		System.out.println("触发鼠标上移事件");
		return true;
	}
	@Override
	public boolean mouseDown() {
		System.out.println("触发鼠标下移事件");
		return true;
	}

}
