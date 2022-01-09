package book.cgyms.creationMethod;

public class Person {
	private String color;
	private String country;
	private String sex;
	private String ageArea;

	// TODO 这就是creationMethod,创建方法
	public static Person blackMan(String country, String ageArea) {
		return new Person("黑", country, "男", ageArea);
	}

	public static Person american(String color, String sex, String ageArea) {
		return new Person(color, "美国", sex, ageArea);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("我是一个来自");
		sb.append(country).append("的");
		sb.append(color).append("皮肤");
		sb.append(ageArea).append("年");
		sb.append(sex).append("人");
		return sb.toString();
	}

	private Person(String color, String country, String sex, String ageArea) {
		this.color = color;
		this.country = country;
		this.sex = sex;
		this.ageArea = ageArea;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAgeArea() {
		return ageArea;
	}

	public void setAgeArea(String ageArea) {
		this.ageArea = ageArea;
	}

}
