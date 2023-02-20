package entities;

public class Course {

	public Course(String name, Double price) {
		this.name = name;
		this.price = price;

	}

	private String name;
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
