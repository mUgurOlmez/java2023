package kodlama.io.programmingLanguages.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.FrameworksService;
import kodlama.io.programmingLanguages.business.request.CreateFrameworkRequest;
import kodlama.io.programmingLanguages.business.request.UpdateFrameworkRequest;
import kodlama.io.programmingLanguages.business.response.GetAllFrameworksResponse;
import kodlama.io.programmingLanguages.business.response.GetByIdFrameworkResponse;
import kodlama.io.programmingLanguages.core.ulitities.mappers.ModelMapperService;
import kodlama.io.programmingLanguages.dataAccess.abstracts.FrameworksRepesitory;
import kodlama.io.programmingLanguages.entities.Framework;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class FrameworksManager implements FrameworksService {
		ModelMapperService modelMapperService;
		FrameworksRepesitory frameworksRepesitory;
	
		@Override
	
		public List<GetAllFrameworksResponse> getAll() {
		List<Framework> frameworks=this.frameworksRepesitory.findAll();
		
		List<GetAllFrameworksResponse> frameworksResponses=frameworks.stream()
				.map(framework->this.modelMapperService.forResponse()
			    .map(framework, GetAllFrameworksResponse.class)).collect(Collectors.toList());

		return frameworksResponses;
	}

	@Override
	public GetByIdFrameworkResponse GetById(int id) {
	Framework framework=this.frameworksRepesitory.findById(id).orElseThrow();
	GetByIdFrameworkResponse response=modelMapperService.forResponse().map(framework,GetByIdFrameworkResponse.class);
		return response;
	}

	@Override
	public void add(CreateFrameworkRequest createFrameworkRequest) {
		Framework framework=modelMapperService.forRequest().map(createFrameworkRequest,Framework.class);
		frameworksRepesitory.save(framework);
	}

	@Override
	public void update(UpdateFrameworkRequest updateFrameworkRequest) {
		Framework framework=modelMapperService.forRequest().map(updateFrameworkRequest, Framework.class);
		frameworksRepesitory.save(framework);
	}

	@Override
	public void delete(int id) {
		frameworksRepesitory.deleteById(id);
	}

}
