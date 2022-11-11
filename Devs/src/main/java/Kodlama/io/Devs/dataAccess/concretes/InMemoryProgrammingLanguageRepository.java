package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	private List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		this.programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
	}

	// * * * CRUD OPERATIONS * * *
	
	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
		return programmingLanguages.add(programmingLanguage) ? programmingLanguage : null;
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
		return programmingLanguages.set(getIndexById(programmingLanguage.getId()), programmingLanguage);

	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage) {
		return programmingLanguages.remove(getIndexById(programmingLanguage.getId()));
		
	}

	// * * * GET METHODS * * *
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguages.stream().filter(plan -> plan.getId() == id).findFirst().orElse(null);
	}
	
	@Override
	public ProgrammingLanguage getByName(String name) {
		return programmingLanguages.stream().filter(plan -> plan.getName() == name).findFirst().orElse(null);
	}

	// * * * indexOf() METHOD * * *
	
	private int getIndexById(int id) {
		ProgrammingLanguage programmingLanguage = getById(id);
		return programmingLanguages.indexOf(programmingLanguage);
	}

}
