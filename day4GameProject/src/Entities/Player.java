package Entities;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int birthYear;
	private String nationlityId;

	public Player() {

	}

	public Player(int id, String firstName, String lastName, int birthYear, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationlityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNationlityId() {
		return nationlityId;
	}

	public void setNationlityId(String nationlityId) {
		this.nationlityId = nationlityId;
	}
}
