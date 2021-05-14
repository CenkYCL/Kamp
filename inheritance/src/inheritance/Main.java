package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndivitualCustomer indivitualCustomer = new IndivitualCustomer();
		indivitualCustomer.id = 1;
		indivitualCustomer.row = "1.ci S�ra";
		indivitualCustomer.firstName = "Cenk";
		indivitualCustomer.lastName = "Y�cel";
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer ();
		corporateCustomer.id = 2;
		corporateCustomer.row = "2.ci S�ra s";
		corporateCustomer.customerNumber = "Y�lmaz A.�";
		corporateCustomer.companyName = "YILMAZLAR A�";
		corporateCustomer.taxNumber  = "12345";
		
		
		CustomerManager customermanager = new CustomerManager();
		customermanager.add(indivitualCustomer);
		customermanager.add(corporateCustomer);
		
		customermanager.delete(indivitualCustomer);
		customermanager.delete(corporateCustomer);
		
		
		}

	}
