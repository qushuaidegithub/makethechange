package book.cgyms.strategynew;

public class BuildingWorker extends Workman {

	public Workable workable;

	public BuildingWorker() {
		this.workable = new Building();
	}

	@Override
	public void work() {
		this.workable.work();

	}

	public Workable getWorkable() {
		return workable;
	}

	public void setWorkable(Workable workable) {
		this.workable = workable;
	}

}
