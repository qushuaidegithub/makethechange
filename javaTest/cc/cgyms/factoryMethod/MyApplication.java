package book.cgyms.factoryMethod;

public class MyApplication extends Appliction {

	@Override
	public Document CreateDocument() throws Exception {
		if (clazz != null) {
			return clazz.newInstance();
		}
		if (this.type.equals("WORD")) {
			return new MyWordDocument();
		}
		if (this.type.equals("EXCEL")) {
			return new MyExcelDocument();
		}
		return null;
	}
}
