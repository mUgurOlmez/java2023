package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.business.request.CreateFrameworkRequest;
import kodlama.io.programmingLanguages.business.request.UpdateFrameworkRequest;
import kodlama.io.programmingLanguages.business.response.GetAllFrameworksResponse;
import kodlama.io.programmingLanguages.business.response.GetByIdFrameworkResponse;

public interface FrameworksService {
	List<GetAllFrameworksResponse> getAll();
	GetByIdFrameworkResponse GetById(int id); 
	void add(CreateFrameworkRequest createFrameworkRequest);
	void update(UpdateFrameworkRequest updateFrameworkRequest);
	void delete(int id);

}
