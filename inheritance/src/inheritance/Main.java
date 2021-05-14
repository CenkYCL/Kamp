package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndivitualCustomer indivitualCustomer = new IndivitualCustomer();
		indivitualCustomer.id = 1;
		indivitualCustomer.row = "1.ci Sýra";
		indivitualCustomer.firstName = "Cenk";
		indivitualCustomer.lastName = "Yücel";
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer ();
		corporateCustomer.id = 2;
		corporateCustomer.row = "2.ci Sýra s";
		corporateCustomer.customerNumber = "Yýlmaz A.Þ";
		corporateCustomer.companyName = "YILMAZLAR AÞ";
		corporateCustomer.taxNumber  = "12345";
		
		
		CustomerManager customermanager = new CustomerManager();
		customermanager.add(indivitualCustomer);
		customermanager.add(corporateCustomer);
		
		customermanager.delete(indivitualCustomer);
		customermanager.delete(corporateCustomer);
		
		
		}

	}
