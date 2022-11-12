package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.DeleteSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnology.CreateSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.DeleteSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetByIdSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.UpdateSubTechnologyResponse;

@RestController
@RequestMapping("/api/subtechnologies/")
public class SubTechnologiesController {

	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}

	// * * * CRUD OPERATIONS * * *

	@PostMapping("add")
	public CreateSubTechnologyResponse add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception {
		return subTechnologyService.add(createSubTechnologyRequest);
	}

	@PutMapping("update")
	public UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
		return subTechnologyService.update(updateSubTechnologyRequest);
	}

	@DeleteMapping("delete")
	public DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
		return subTechnologyService.delete(deleteSubTechnologyRequest);
	}

	// * * * GET METHODS * * *

	@GetMapping("getall")
	public List<GetAllSubTechnologiesResponse> getAll() {
		return subTechnologyService.getAll();
	}

	@GetMapping("getbyid")
	public GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest) {
		return subTechnologyService.getById(getByIdSubTechnologyRequest);
	}
}
