package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepesitory;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service//ioc yerlessin dıye service eklıyoruz
public class BrandBusinessRules {
	private BrandRepesitory brandRepesitory;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepesitory.existsByName(name)) {
			throw new BusinessException("Brand name already exists");//java exception types
		}
	}
	

}
