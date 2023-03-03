package kodlama.io.programmingLanguages.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.LanguagesService;
import kodlama.io.programmingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguagesResponse;
import kodlama.io.programmingLanguages.business.response.GetBylanguageIdResponse;
import kodlama.io.programmingLanguages.core.ulitities.mappers.ModelMapperService;
import kodlama.io.programmingLanguages.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.programmingLanguages.entities.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguagesManager implements LanguagesService {
	private ModelMapperService modelMapperService;
	private LanguagesRepository languagesRepesitory;
	

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languagesRepesitory.findAll();

		List<GetAllLanguagesResponse> languagesResponses = languages.stream()
				.map(language -> this.modelMapperService.forResponse().map(language, GetAllLanguagesResponse.class))
				.collect(Collectors.toList());

		return languagesResponses;
	}

	@Override
	public GetBylanguageIdResponse GetById(int id) {
		Language language= this.languagesRepesitory.findById(id).orElseThrow();
	GetBylanguageIdResponse response =modelMapperService.forResponse().map(language, GetBylanguageIdResponse.class);
		return response;
		
	}
	
	
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language=modelMapperService.forRequest().map(createLanguageRequest, Language.class);
		
		this.languagesRepesitory.save(language);
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		Language language = modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
		languagesRepesitory.save(language);

	}

	@Override
	public void delete(int id) {
		this.languagesRepesitory.deleteById(id);		
	}

	

	
}
