package book.cgyms.decorator;

public class Car {
	private String color;
	private String number;

	public Car(String color, String number) {
		super(); 
		this.color = color;
		this.number = number;
	}

	public String toString() {
		return this.number + ",一辆" + this.color + "汽车";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
