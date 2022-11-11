package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.constants.Messages;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.DeleteSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.GetByIdSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.GetByNameSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnology.CreateSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.DeleteSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetAllSubTechnologiesResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetByIdSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.GetByNameSubTechnologyResponse;
import Kodlama.io.Devs.business.responses.subTechnology.UpdateSubTechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {
	
	@Autowired
	private SubTechnologyRepository subTechnologyRepository;
	private ModelMapper modelMapper;

	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, ModelMapper modelMapper) {
		this.subTechnologyRepository = subTechnologyRepository;
		this.modelMapper = modelMapper;
	}

	// * * * CRUD OPERATIONS * * *

	@Override
	public CreateSubTechnologyResponse add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception {
		nameCannotBeSame(createSubTechnologyRequest.getName());

		SubTechnology subTechnology = modelMapper.map(createSubTechnologyRequest, SubTechnology.class);
		SubTechnology saveSubTechnologyResult = subTechnologyRepository.save(subTechnology);

		CreateSubTechnologyResponse createSubTechnologyResponse = modelMapper.map(saveSubTechnologyResult,
				CreateSubTechnologyResponse.class);

		return createSubTechnologyResponse;
	}

	@Override
	public UpdateSubTechnologyResponse update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
		nameCannotBeSame(updateSubTechnologyRequest.getName());

		SubTechnology subTechnology = modelMapper.map(updateSubTechnologyRequest, SubTechnology.class);
		SubTechnology saveSubTechnologyResult = subTechnologyRepository.save(subTechnology);

		UpdateSubTechnologyResponse updateSubTechnologyResponse = modelMapper.map(saveSubTechnologyResult,
				UpdateSubTechnologyResponse.class);
		return updateSubTechnologyResponse;
	}

	@Override
	public DeleteSubTechnologyResponse delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {

		SubTechnology getReferenceByIdSubTechnologyResult = subTechnologyRepository
				.getReferenceById(deleteSubTechnologyRequest.getId());
		subTechnologyRepository.delete(getReferenceByIdSubTechnologyResult);

		DeleteSubTechnologyResponse deleteSubTechnologyResponse = modelMapper.map(getReferenceByIdSubTechnologyResult,
				DeleteSubTechnologyResponse.class);
		return deleteSubTechnologyResponse;
	}

	// * * * GET METHODS * * *

	@Override
	public List<GetAllSubTechnologiesResponse> getAll() {
		List<SubTechnology> findAllSubTechnologyResult = subTechnologyRepository.findAll();
		return modelMapper.map(findAllSubTechnologyResult, new TypeToken<List<GetAllSubTechnologiesResponse>>() {
		}.getType());
	}

	@Override
	public GetByIdSubTechnologyResponse getById(GetByIdSubTechnologyRequest getByIdSubTechnologyRequest) {

		SubTechnology getReferenceByIdSubTechnologyResult = subTechnologyRepository
				.getReferenceById(getByIdSubTechnologyRequest.getId());
		GetByIdSubTechnologyResponse getByIdSubTechnologyResponse = modelMapper.map(getReferenceByIdSubTechnologyResult,
				GetByIdSubTechnologyResponse.class);

		return getByIdSubTechnologyResponse;
	}

	@Override
	public GetByNameSubTechnologyResponse getByName(GetByNameSubTechnologyRequest getByNameSubTechnologyRequest) {
		SubTechnology getReferenceByNameSubTechnologyResult = new SubTechnology();
		getReferenceByNameSubTechnologyResult = subTechnologyRepository
				.getByName(getByNameSubTechnologyRequest.toString());

		GetByNameSubTechnologyResponse getByNameSubTechnologyResponse = modelMapper
				.map(getReferenceByNameSubTechnologyResult, GetByNameSubTechnologyResponse.class);

		return getByNameSubTechnologyResponse;
	}

	// * * * BUSINESS RULES * * *

	private void nameCannotBeSame(String name) throws Exception {

		SubTechnology getByNameSubTechnologyResult = subTechnologyRepository.getByName(name);

		var result = getByNameSubTechnologyResult;

		if (result != null) {
			throw new Exception(Messages.NAME_ALREADY_EXISTS);
		}
	}
}
