package Kodlama.io.Devs.dataAccess.abstracts;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
	public ProgrammingLanguage getByName(String name);
=======
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
>>>>>>> branch 'master' of https://github.com/Fateehs/Kodlama.io.Devs.git
}
