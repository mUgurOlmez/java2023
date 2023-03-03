package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;
//jpa defaultta hibernate implemantasyonu kullanır 
														//hangi entity için
														//onun primarykey alanı nedir
public interface BrandRepesitory extends JpaRepository<Brand,Integer>{
				//jparepesitory extend ettiğimiz için java
				//bu katmanın bır repository oldugunu anlıyor
				//bu yüzden @service anatasyonu kullanamıza gerek yok
	boolean existsByName(String name);//spring jpa keywords											

}
//btk ileri java spring