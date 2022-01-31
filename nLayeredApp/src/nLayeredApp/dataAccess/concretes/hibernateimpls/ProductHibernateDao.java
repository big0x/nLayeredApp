package nLayeredApp.dataAccess.concretes.hibernateimpls;

import java.util.List;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile kaydedildi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate ile silindi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
