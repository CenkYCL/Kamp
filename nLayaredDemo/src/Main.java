import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.dateAccess.concretes.HibernateProductDao;
import nLayaredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao());
		
		Product procut = new Product(1,1,"Elma",12,50);
		productService.add(procut);

	}

}
