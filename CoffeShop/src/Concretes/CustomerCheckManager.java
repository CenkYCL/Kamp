package Concretes;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalIdentity() == "12345678910") {
			return true;
		}
		else {
			return false;
		}
	}
	}


