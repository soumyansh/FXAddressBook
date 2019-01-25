package application;

public class Person {

	private String firstName;
	private String lastName;
	private String phone;
	private String city;

	public Person(String firstName, String lastName, String phone, String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.city = city;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
