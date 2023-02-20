package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
//burada kullanılan request ve response DTO data transfer object
@Service//ioc ye yerlessin herseferinde yenıden ureyılmesın
@AllArgsConstructor	//modelmapper enjeksiyonu için 
public class ModelMapperManager implements ModelMapperService {
	//emjeksiyon 1 tane uretsın onu kullansın
	private ModelMapper modelMapper;

	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true).
		setMatchingStrategy(MatchingStrategies.LOOSE);//loose gevşek mapleme yap veri tabanındakı tum verılerı almayacaksan 5 verının 3 unu maple
		return this.modelMapper;
		//strategies strict tanımlandıgında herşeyi maplemesi gerekiyor
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)//belirsizlik oldugu durumda onu ignore et
		.setMatchingStrategy(MatchingStrategies.STANDARD);//standart ben request aldıgımda hersey maplansın herseyın bı karsılıgı olsun yoksa kız

		return this.modelMapper;
	}

}
