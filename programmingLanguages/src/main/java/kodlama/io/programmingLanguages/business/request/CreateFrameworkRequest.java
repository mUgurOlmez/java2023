package kodlama.io.programmingLanguages.business.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFrameworkRequest {

	@NotNull
	@NotBlank
	private String name;
	@NotNull
	@NotBlank
	private int languageId;
}
