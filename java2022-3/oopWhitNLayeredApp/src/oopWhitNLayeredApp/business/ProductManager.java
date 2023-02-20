package oopWhitNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWhitNLayeredApp.core.logging.Logger;
import oopWhitNLayeredApp.dataAcces.HibernateProductDao;
import oopWhitNLayeredApp.dataAcces.JdbcProductDao;
import oopWhitNLayeredApp.dataAcces.ProductdDao;
import oopWhitNLayeredApp.entities.Product;

public class ProductManager {
	private ProductdDao productDao;
	private Logger[] loggers;// list bana liste ver java util

	public ProductManager(ProductdDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	

	public void add(Product product) throws Exception {
		// iş kuralları business rules
		if (product.getUnitPrice() < 10) {
			// Exception hata fırlatma
			throw new Exception("Ürün fiyatı 10dan küçük olamaz");
		}

		productDao.add(product);
		
		for (Logger logger : loggers) {//[db,mail]
			logger.log(product.getName());
			
		}
	}
}
