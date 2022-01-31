package nLayeredApp.core.dataAccess;

import java.util.List;

import nLayeredApp.core.entities.Entity;

//Repository pattern
public interface CrudRepository<T extends Entity> {

	void add(T entity);

	void update(T entity);

	void delete(T entity);
	
	List<T> getAll();
	
}
