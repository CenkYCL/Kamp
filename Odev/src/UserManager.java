
public class UserManager {
	
	public void add(User user) {
		System.out.println("Merhaba, bilgileriniz eklendi" + " : " + user.getId() + user.getCustomerNumber())  ;
		
	}
	
	public void delete(User user) {
		System.out.println("Merhaba, bilgileriniz silindi" + " : " +  user.getId() + user.getCustomerNumber());
	}
	
	public void update(User user) {
		System.out.println("Merhaba, bilgileriniz güncellendi" + " : " + user.getId() + user.getCustomerNumber());
	}

}
