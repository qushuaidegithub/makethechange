package book.cgyms.decorator;

public class TopPrint extends PrintDecorator {

	private IPrintCar iPrintCar;

	public TopPrint(IPrintCar iPrintCar) {
		this.iPrintCar = iPrintCar;
	}

	@Override
	public void printCarColor(String color) {
		color = "高档的" + color;
		iPrintCar.printCarColor(color);
	}

}
