package book.cgyms.factoryMethod;

public class MyExcelDocument extends Document {
	public MyExcelDocument() {
		System.out.println("创建新EXCEL文档");
	}

	@Override
	public void Open() {
		System.out.println("打开文档");
	}

	@Override
	public void Close() {
		System.out.println("关闭文档");
	}

}
