package oop1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		product1.setName("Deloghi kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		// set value
		// get
		// System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("Smeg kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("</ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCostumer individualCostumer = new IndividualCostumer();
		individualCostumer.setId(1);
		individualCostumer.setPhone("05222222222");
		individualCostumer.setCustomerNumber("12345");
		individualCostumer.setFirstName("engin");
		individualCostumer.setLastName("Demiroğ");
		
		CorporateCostumer corporateCostumer = new CorporateCostumer();
		corporateCostumer.setId(1);
		corporateCostumer.setCompanyName("Kodlama.io");
		corporateCostumer.setPhone("05333333333");
		corporateCostumer.setTaxNumber("11111111111");
		corporateCostumer.setCustomerNumber("54321");
		
		Costumer[] costumers = {individualCostumer,corporateCostumer};
		
		
		
	}
}
