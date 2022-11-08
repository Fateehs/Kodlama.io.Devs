package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	// * * * CRUD OPERATIONS * * *
	
	@PostMapping("/add")
	public ProgrammingLanguage add(ProgrammingLanguage programminglanguage) throws Exception {
		return programmingLanguageService.add(programminglanguage);
	}
	
	@PutMapping("/update")
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception {
		return programmingLanguageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage) {
		return programmingLanguageService.delete(programmingLanguage);
	}
	
	// * * * GET METHODS * * *
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageService.getById(id);
	}
	
	@GetMapping("/getbyname")
	public ProgrammingLanguage getByName(String name) {
		return programmingLanguageService.getByName(name);
	}
}
