package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.id + " " + customer.row + " " + "EKLEND�");	
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.id + " " + customer.row + " " + "S�L�ND�");

}
}