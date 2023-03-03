package kodlama.io.programmingLanguages.business.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBylanguageIdResponse {
	@NotNull
	@NotBlank
	private int id;
	
	private String name;

}
