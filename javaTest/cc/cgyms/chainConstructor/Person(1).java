package book.cgyms.chainConstructor;

public class Person {
	private String color;
	private String country;
	private String sex;
	private String ageArea;

	// TODO 这就是链构造函数
	public Person(String color) {
		this(color, "未知");// TODO 调用自身构造函数用this(),不可以用new
	}

	public Person(String color, String country) {
		this(color, country, "未知");
	}

	public Person(String color, String country, String sex) {
		this(color, country, sex, "未知");
	}

	public Person(String color, String country, String sex, String ageArea) {
		this.color = color;
		this.country = country;
		this.sex = sex;
		this.ageArea = ageArea;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("我是一个来自");
		sb.append(this.getCountry()).append("的");
		sb.append(this.getColor()).append("皮肤");
		sb.append(this.getAgeArea()).append("年");
		sb.append(this.getSex()).append("人");
		return sb.toString();
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
