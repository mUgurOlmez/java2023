package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguagesResponse;
import kodlama.io.programmingLanguages.business.response.GetBylanguageIdResponse;

public interface  LanguagesService {
	
	List<GetAllLanguagesResponse> getAll();
	GetBylanguageIdResponse GetById(int id); 
	void add(CreateLanguageRequest createLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
	void delete(int id);
	

}
