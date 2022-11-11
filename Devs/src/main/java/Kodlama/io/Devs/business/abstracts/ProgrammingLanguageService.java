package Kodlama.io.Devs.business.abstracts;

import java.util.List;

<<<<<<< HEAD
import Kodlama.io.Devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.GetByNameProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.programmingLanguage.CreateProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.DeleteProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.GetByNameProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.UpdateProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	
	// * * * CURD OPERATIONS * * *
	
	CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
	DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	// * * * GET METHODS * * *
	
	List<GetAllProgrammingLanguagesResponse> getAll();
	GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest);
	GetByNameProgrammingLanguageResponse getByName(GetByNameProgrammingLanguageRequest getByNameProgrammingLanguageRequest );
=======
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	// * * * CURD OPERATIONS * * *
	
	ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;
	ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception;
	ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage);
	
	// * * * GET METHODS * * *
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage getByName(String name);
>>>>>>> branch 'master' of https://github.com/Fateehs/Kodlama.io.Devs.git
}
