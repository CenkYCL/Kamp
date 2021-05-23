import Abstracts.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager CustomerManager = new NeroCustomerManager();
		CustomerManager.save(new Customer(1,"Cenk","Yücel",1993,"1234567890"));
		

	}

}
