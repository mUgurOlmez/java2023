package kodlama.io.rentACar.business.reques;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
	private int id;
	private String name;
	private String brandId;
}
