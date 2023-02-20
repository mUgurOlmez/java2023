package dataAcces;

import entities.Category;

public class JdbcCategorydao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi" + category.getName());
	}

}
