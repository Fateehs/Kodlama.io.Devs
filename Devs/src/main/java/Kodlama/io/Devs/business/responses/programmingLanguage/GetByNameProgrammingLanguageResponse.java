package Kodlama.io.Devs.business.responses.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByNameProgrammingLanguageResponse {
	private int id;
	private String name;
}
