package Kodlama.io.Devs.business.abstracts;

import java.util.List;

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
}
