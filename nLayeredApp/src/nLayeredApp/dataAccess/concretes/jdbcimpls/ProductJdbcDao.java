package nLayeredApp.dataAccess.concretes.jdbcimpls;

import java.util.List;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {

	@Override
	public void add(Product product) {
		//buraya jdbc kodlara : veri taban�na eri�im kodlar�
		System.out.println("JDBC ile eklendi");

	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC ile g�ncellendi");

	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC ile silindi");

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
