package oop1;
//individual bireysel
//extends genişletmek individualcostumer bir costumerdir demek
public class IndividualCostumer extends Costumer {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
