package oopWhitNLayeredApp;

import oopWhitNLayeredApp.business.ProductManager;
import oopWhitNLayeredApp.core.logging.DatabaseLogger;
import oopWhitNLayeredApp.core.logging.FileLogger;
import oopWhitNLayeredApp.core.logging.Logger;
import oopWhitNLayeredApp.core.logging.MailLogger;
import oopWhitNLayeredApp.dataAcces.HibernateProductDao;
import oopWhitNLayeredApp.dataAcces.JdbcProductDao;
import oopWhitNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",9000);
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
