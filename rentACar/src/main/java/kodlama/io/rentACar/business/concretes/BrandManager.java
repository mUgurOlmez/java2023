package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracsts.BrandService;
import kodlama.io.rentACar.business.reques.CreateBrandRequest;
import kodlama.io.rentACar.business.reques.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepesitory;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service // bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
	private BrandRepesitory brandRepesitory;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;

	// @Autowired //enjekte ettiğiniz nesne için bellekte örnek oluşturuyor
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepesitory.findAll();// brandrepesitori hepsini ara
														// stream.map elimizde bir liste varsa onu tektek dolasmanızı
														// sağlıyor foreachın yaptıgını yapıyor.
														// ->brand takma ısın herbir brandiiçin maplama yap
		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());
		// herbir brandi gelallbrandresponse.class çevir .collet ile liste olustur
		// iş kurallları
		
		
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());																					// brand tipine çevir

		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);// createbrandrequesti
		
		// arka planda brand newlıyor sonra createbrandreuestın tum alanlarını
		// karsılastırıp aynı olanları new ledıgıne aktarıyor
		// elinde artık veri tabanı nesnesi var yanı bı tane brand nesnen var
		this.brandRepesitory.save(brand);
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepesitory.findById(id).orElseThrow();// elsetrhrow bulamazsan hata fırlat
		// daha sonra defansif ve iş kodu yazarak geliştirilecek
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepesitory.save(brand);
		// savede id yoksa insert yapar id oldugu için update işlemi gerçekleştirir
	}

	@Override
	public void delete(int id) {
		this.brandRepesitory.deleteById(id);
		// deletebyid id sine bakarak delete işlemi yapar
		// silme işlemini farklı parametrelerle yapılacaksa request nesnesine
		// cevirebiliriz
		// ama genellikle id ile delete yapılır.

	}

}
