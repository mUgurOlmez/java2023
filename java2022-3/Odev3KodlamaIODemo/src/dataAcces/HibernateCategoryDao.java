package dataAcces;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate İle Eklendi" + category.getName());
	}

}
