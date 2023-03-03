package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracsts.ModelService;
import kodlama.io.rentACar.business.reques.CreateModelRequest;
import kodlama.io.rentACar.business.reques.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdModelResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	@Override
	
	
	public List<GetAllModelsResponse> getAll() {
		List<Model> models = modelRepository.findAll();

		
List<GetAllModelsResponse> modelresponse = models.stream()
.map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class))
.collect(Collectors.toList());
// herbir brandi gelallbrandresponse.class çevir .collet ile liste olustur
// iş kurallları
return modelresponse;
		
		
	}
	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);// createbrandrequesti
		
		this.modelRepository.save(model);
	}
	@Override
	public GetByIdModelResponse getById(int id) {
		Model model = this.modelRepository.findById(id).orElseThrow();// elsetrhrow bulamazsan hata fırlat
		// daha sonra defansif ve iş kodu yazarak geliştirilecek
		GetByIdModelResponse response = this.modelMapperService.forResponse().map(model, GetByIdModelResponse.class);
		return response;
		
	}
	@Override
	public void update(UpdateModelRequest updateModelRequest) {

		Model model = this.modelMapperService.forRequest().map(updateModelRequest, Model.class);
		this.modelRepository.save(model);
	}

		public void delete(int id) {
			this.modelRepository.deleteById(id);
		
	}

}
