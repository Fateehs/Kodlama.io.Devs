package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.DeleteSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnology.CreateSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.DeleteSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetByIdSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.UpdateSubTechnologyResponse;

public interface SubTechnologyService {

	// * * * CRUD OPERATIONS * * * 
	
		CreateSubTechnologyResponse add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception;
		
		UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception;
		
		DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
		
		// * * * GET METHODS * * * 
		
		List<GetAllSubTechnologiesResponse> getAll();
		
		GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest);
}
