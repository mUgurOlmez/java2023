package kodlama.io.rentACar.business.abstracsts;

import java.util.List;

import kodlama.io.rentACar.business.reques.CreateBrandRequest;
import kodlama.io.rentACar.business.reques.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
//bussiness yerine service olarak bi katmanda gorebiliriz
public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
	
}
