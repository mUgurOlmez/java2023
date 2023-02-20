package oopWhitNLayeredApp.dataAcces;

import oopWhitNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductdDao{
		public void add(Product product) {
			//sadece ve sadece db erişim kodları buraya yazılır SQL
			System.out.println("Hibernate ile veritabanına eklendi");
		}


}
