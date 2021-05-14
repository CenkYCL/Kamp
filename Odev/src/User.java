
public class User {
	
	private int id;
	private String customerNumber;
	
	public User() {
		
	}
	
	public User(int id, String customerNumber) {
		
		this.id = id;
		this.customerNumber = customerNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return  " "+ customerNumber + " : ";
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	

}
