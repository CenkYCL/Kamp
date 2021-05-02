package introOpp;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(15,"Cenk",8.99, "Kýrmýzý");
		Product product2 = new Product(15,"Ali",7.99, "Sarý");
		Product product3 = new Product(15,"Veli",9.99, "Beyaz");
		
		
		Product [] products = {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		

	}

}
