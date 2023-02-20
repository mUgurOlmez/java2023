package classesWhithAttributes;

public class Main {

	
	public static void main(String[] args) {

		Product product = new Product(1, "Laptop","Asuslaptop",5000,3,"kırmızı");
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Asus Laptop");
		//product.setPrice(5000);
		//product.setStockAmount(3);

		ProductMager productMager = new ProductMager();
		productMager.Add(product);
		System.out.println(product.getKod());
	}

}
