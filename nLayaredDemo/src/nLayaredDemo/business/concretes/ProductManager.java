package nLayaredDemo.business.concretes;

import java.util.List;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.dateAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryID()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
