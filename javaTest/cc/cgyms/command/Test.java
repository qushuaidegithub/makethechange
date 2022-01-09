package book.cgyms.command;

public class Test {
	// 命令模式
	public static void main(String[] args) {
		CatalogApp ca = new CatalogApp();
		ca.getHandler("NEW_WORKSHOP").execute();
		ca.getHandler("ALL_WORKSHOP").execute();

		for (int i = 0; i < ca.commonds.size(); i++) {
			System.out.println(ca.commonds.get(i));
		}

		CatalogApp ca2 = new CatalogApp();
		ca2.getHandler("NEW_WORKSHOP").execute();
		ca2.getHandler("ALL_WORKSHOP").execute();
		
		for (int i = 0; i < ca2.commonds.size(); i++) {
			System.out.println(ca2.commonds.get(i));
		}
	}

}
