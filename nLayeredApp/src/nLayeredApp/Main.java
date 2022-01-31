package nLayeredApp;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductHibernateDao());
		productService.add(new Product(1, "Elma", 15));
	}

}
