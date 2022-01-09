package book.cgyms.factoryMethod;

public class Test {
	//工厂方法模式
	public static void main(String[] args) throws Exception {
		Appliction appliction = new MyApplication();
		// appliction.NewDocument("WORD");
		// appliction.NewDocument("EXCEL");
		Document document = appliction.NewDocumentAuto(MyWordDocument.class);
		document.Close();
	}
}
