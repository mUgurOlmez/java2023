package kodlama.io.programmingLanguages.core.ulitities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forResponse();

	ModelMapper forRequest();
}
