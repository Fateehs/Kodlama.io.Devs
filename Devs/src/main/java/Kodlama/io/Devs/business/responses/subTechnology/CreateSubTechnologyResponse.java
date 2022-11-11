package Kodlama.io.Devs.business.responses.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechnologyResponse {
	private int id;
	private String name;
	private int programmingLanguageId;
}
