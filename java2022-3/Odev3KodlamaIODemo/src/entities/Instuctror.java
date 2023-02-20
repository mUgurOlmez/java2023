package entities;

public class Instuctror {

	public Instuctror(String name, String lastName) {

		this.name = name;
		this.lastName = lastName;
	}

	private String name;
	private String lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
