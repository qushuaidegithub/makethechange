package book.cgyms.factoryMethod;

public class MyWordDocument extends Document {

	public MyWordDocument() {
		System.out.println("创建新WORD文档");
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
