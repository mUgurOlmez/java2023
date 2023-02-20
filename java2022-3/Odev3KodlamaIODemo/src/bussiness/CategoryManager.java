package bussiness;

import java.util.List;

import dataAcces.CategoryDao;
import entities.Category;
import logging.Ilogger;

public class CategoryManager {

	CategoryDao categoriDao;
	Ilogger[] loggers;
	List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Ilogger[] loggers, List<Category> categories) {
		this.categoriDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;

	}

	public void add(Category category) throws Exception {

		for (Category category1 : categories) {
			if (category1.getName() == category.getName()) {
				throw new Exception("Kategori Tekrarlanamaz.");

			}

		}

		categoriDao.add(category);
		for (Ilogger logger : loggers) {
			logger.log();
		}

	}

}
