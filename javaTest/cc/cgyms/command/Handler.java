package book.cgyms.command;

public abstract class Handler {
	public CatalogApp catalogApp;

	public Handler(CatalogApp catalogApp) {
		this.catalogApp = catalogApp;
	}

	public abstract void execute();
	
}
