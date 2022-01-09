package book.cgyms.decorator;

public class NormalPrint extends PrintCar {

	private Car car;

	public NormalPrint(Car car) {

		this.car = car;
	}

	@Override
	public void printCarColor(String color) {
		this.car.setColor(color);
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
