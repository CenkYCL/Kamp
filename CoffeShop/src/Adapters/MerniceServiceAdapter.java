package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {


		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getTimeOfBirth());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return false;
	}

}
