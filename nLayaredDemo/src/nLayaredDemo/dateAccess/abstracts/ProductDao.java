package nLayaredDemo.dateAccess.abstracts;

import java.util.List;

import nLayaredDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void update(Product product);
	void delete(Product produt);
	Product get(int id);
	List<Product> getAll();

}
