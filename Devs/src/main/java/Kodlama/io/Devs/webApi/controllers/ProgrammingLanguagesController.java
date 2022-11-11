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

@RestController
@RequestMapping("/api/programminglanguages/")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	// * * * CRUD OPERATIONS * * *

	@PostMapping("add")
	public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)
			throws Exception {
		return programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@PutMapping("update")
	public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)
			throws Exception {
		return programmingLanguageService.update(updateProgrammingLanguageRequest);
	}

	@DeleteMapping("delete")
	public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		return programmingLanguageService.delete(deleteProgrammingLanguageRequest);
	}

	// * * * GET METHODS * * *

	@GetMapping("getall")
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("getbyid")
	public GetByIdProgrammingLanguageResponse getById(
			GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {
		return programmingLanguageService.getById(getByIdProgrammingLanguageRequest);
	}

	@GetMapping("getbyname")
	public GetByNameProgrammingLanguageResponse getByName(
			GetByNameProgrammingLanguageRequest getByNameProgrammingLanguageRequest) {
		return programmingLanguageService.getByName(getByNameProgrammingLanguageRequest);
=======
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
>>>>>>> branch 'master' of https://github.com/Fateehs/Kodlama.io.Devs.git
	}
}
