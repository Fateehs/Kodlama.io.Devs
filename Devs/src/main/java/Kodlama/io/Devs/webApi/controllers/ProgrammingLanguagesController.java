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
	}
}
