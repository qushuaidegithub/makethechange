package book.cgyms.command;

public class NewWorkshopHandler extends Handler {
	public NewWorkshopHandler(CatalogApp catalogApp) {
		super(catalogApp);
	}

	@Override
	public void execute() {
		System.out.println("执行NEW_WORKSHOP命令");
	}
}
