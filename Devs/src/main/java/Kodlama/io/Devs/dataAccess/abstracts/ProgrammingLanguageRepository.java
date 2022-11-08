package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	// * * * CRUD OPERATIONS * * * 
	
	ProgrammingLanguage add(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage update(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage);
	
	// * * * GET METHODS * * *
	
	List<ProgrammingLanguage>getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage getByName(String name);
}
