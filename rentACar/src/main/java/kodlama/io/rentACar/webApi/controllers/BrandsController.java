package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracsts.BrandService;
import kodlama.io.rentACar.business.reques.CreateBrandRequest;
import kodlama.io.rentACar.business.reques.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController // annotation bilgilendirme
@RequestMapping("/api/brands") // adresleme
@AllArgsConstructor //parametreli constructor olustur //ioc
public class BrandsController {
	private BrandService brandservice;

	
	@GetMapping()
	public List<GetAllBrandsResponse> getAll() {
		return brandservice.getAll();

	}
	@GetMapping("/{id}")//süslü parantez veriable demek değiken demek
	public GetByIdBrandResponse getById(@PathVariable int id) {//pathvariable /dan sonra yazılan değeri getirecek 
		return brandservice.getById(id);

	}

	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)//postlar 201 döndürsün diye
	public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
		this.brandservice.add(createBrandRequest);

	}
	
	@PutMapping //güncelleme anataasyonu
						//updatebrandrequest ver ama ben onu request bodyden okuyacagım
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
		this.brandservice.update(updateBrandRequest);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id)	{ 
		
		this.brandservice.delete(id);
	
		
	}


}
