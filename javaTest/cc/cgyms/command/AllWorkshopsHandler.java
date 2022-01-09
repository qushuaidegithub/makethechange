package book.cgyms.command;

public class AllWorkshopsHandler extends Handler {
	public AllWorkshopsHandler(CatalogApp catalogApp) {
		super(catalogApp);
	}

	@Override
	public void execute() {
		System.out.println("执行ALL_WORKSHOP命令");
	}
}
