package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracsts.ModelService;
import kodlama.io.rentACar.business.reques.CreateModelRequest;
import kodlama.io.rentACar.business.reques.UpdateBrandRequest;
import kodlama.io.rentACar.business.reques.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdModelResponse;
import lombok.AllArgsConstructor;

@RestController // annotation bilgilendirme
@RequestMapping("/api/models") // adresleme
@AllArgsConstructor // parametre
public class ModelsController {
	private ModelService modelService;

	@GetMapping()
	public List<GetAllModelsResponse> getAll() {
		return modelService.getAll();

	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED) // postlar 201 döndürsün diye
	public void add(@RequestBody() @Valid CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}

	@GetMapping("/{id}") // süslü parantez veriable demek değiken demek
	public GetByIdModelResponse getById(@PathVariable int id) {// pathvariable /dan sonra yazılan değeri getirecek
		return modelService.getById(id);
	}
	@PutMapping // güncelleme anataasyonu
	// updatebrandrequest ver ama ben onu request bodyden okuyacagım
public void update(@RequestBody() UpdateModelRequest updateModelRequest) {
this.modelService.update(updateModelRequest);

}
}