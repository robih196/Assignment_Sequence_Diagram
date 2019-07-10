
public class employee {
	String firstName;
	String lastName;
	String dateOfBirth;
	String phone;
	
	
	public employee() {
		super();
	}


	public employee(String firstName, String lastName, String dateOfBirth,
			String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
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


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printAllinfo(){
		System.out.println("Name :"+firstName+" "+lastName);
		System.out.println("Joining Date :"+dateOfBirth);
		System.out.println("Phone number :"+phone);
	}
	
}
