package book.cgyms.command;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//命令模式
public class CatalogApp {
	//存储命令集
	private Map<String, Handler> handlers;
	// 记录10个命令
	//public Queue<String> commonds = new ArrayBlockingQueue<String>(10);
	public LinkedList<String> commonds = new LinkedList<String>();
	public CatalogApp() {
		//构造对象时初始化命令集
		createHandlers();
	}

	public Handler getHandler(String commond) {
		if (commonds.size() == 10) {
			commonds.remove();
		}
		commonds.add(commond);
		return handlers.get(commond);
	}

	private void createHandlers() {
		handlers = new HashMap<String, Handler>();
		handlers.put("NEW_WORKSHOP", new NewWorkshopHandler(this));
		handlers.put("ALL_WORKSHOP", new AllWorkshopsHandler(this));
	}
}
