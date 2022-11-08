package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.constants.Messages;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	// * * * CRUD OPERATIONS * * *
	
	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCannotBeSame(programmingLanguage.getName());

		return programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCannotBeSame(programmingLanguage.getName());

		return programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageRepository.delete(programmingLanguage);
	}

	// * * * GET METHODS * * *
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}
	
	public ProgrammingLanguage getByName(String name) {
		return programmingLanguageRepository.getByName(name);
	}

	// * * * BUSINESS RULES * * *
	private void nameCannotBeSame(String name) throws Exception {

		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getByName(name);

		var result = programmingLanguage;

		if (result != null) {
			throw new Exception(Messages.PLAN_NAME_ALREADY_EXISTS);
		}
	}
}
