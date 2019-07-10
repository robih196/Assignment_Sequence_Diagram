
public class Address extends employee {
	String street;
	String postOffice;
	String policeStation;
	String city;
	
	
	public Address() {
		super();
	}


	public Address(String firstName, String lastName, String dateOfBirth,
			String phone,String street, String postOffice, String policeStation,
			String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.street = street;
		this.postOffice = postOffice;
		this.policeStation = policeStation;
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getPostOffice() {
		return postOffice;
	}


	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}


	public String getPoliceStation() {
		return policeStation;
	}


	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public void printAllinfo(){
		System.out.println("Name :"+firstName+" "+lastName);
		System.out.println("Joining Date :"+dateOfBirth);
		System.out.println("Phone Number :"+phone);
		System.out.println("Address :"+street+", "+postOffice+", "+policeStation+", "+city);
	}
	
}
