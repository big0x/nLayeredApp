package nLayeredApp.dataAccess.concretes.hibernateimpls;

import java.util.ArrayList;
import java.util.List;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;
public class CategoryHibernateDao implements CategoryDao {
	
	List<Category> categorylist = new ArrayList<>();

	@Override
	public void add(Category category) {
		categorylist.add(category);
		System.out.println("Hibernate ile eklendi");
	}

	@Override
	public void update(Category updatedCategory) {
	for (Category category : categorylist) {
			if (category.getId() == updatedCategory.getId()) {
				categorylist.set(categorylist.indexOf(category), updatedCategory);
			} 
		System.out.println("Hibernate ile güncellendi");
	}		
	}

	@Override
	public void delete(Category category) {
		categorylist.remove(category);
		System.out.println("Hibernate ile silindi");
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
