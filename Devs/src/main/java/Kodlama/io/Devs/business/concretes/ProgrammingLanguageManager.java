package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.constants.Messages;
import Kodlama.io.Devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.GetByIdProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.programmingLanguage.CreateProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.DeleteProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.programmingLanguage.UpdateProgrammingLanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	@Autowired
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private ModelMapper modelMapper;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,
			ModelMapper modelMapper) {
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.modelMapper = modelMapper;
	}

	// * * * CRUD OPERATIONS * * *

	@Override
	public CreateProgrammingLanguageResponse add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)
			throws Exception {
		nameCannotBeSame(createProgrammingLanguageRequest.getName());

		ProgrammingLanguage programmingLanguage = modelMapper.map(createProgrammingLanguageRequest,
				ProgrammingLanguage.class);
		ProgrammingLanguage saveProgrammingLanguageResult = programmingLanguageRepository.save(programmingLanguage);

		CreateProgrammingLanguageResponse createProgrammingLanguageResponse = modelMapper
				.map(saveProgrammingLanguageResult, CreateProgrammingLanguageResponse.class);

		return createProgrammingLanguageResponse;
	}

	@Override
	public UpdateProgrammingLanguageResponse update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)
			throws Exception {
		nameCannotBeSame(updateProgrammingLanguageRequest.getName());

		ProgrammingLanguage programmingLanguage = modelMapper.map(updateProgrammingLanguageRequest,
				ProgrammingLanguage.class);
		ProgrammingLanguage saveProgrammingLanguageResult = programmingLanguageRepository.save(programmingLanguage);

		UpdateProgrammingLanguageResponse updateProgrammingLanguageResponse = modelMapper
				.map(saveProgrammingLanguageResult, UpdateProgrammingLanguageResponse.class);

		return updateProgrammingLanguageResponse;
	}

	@Override
	public DeleteProgrammingLanguageResponse delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {

		ProgrammingLanguage getReferenceByIdProgrammingLanguageResult = programmingLanguageRepository
				.getReferenceById(deleteProgrammingLanguageRequest.getId());
		programmingLanguageRepository.delete(getReferenceByIdProgrammingLanguageResult);

		DeleteProgrammingLanguageResponse deleteProgrammingLanguageResponse = modelMapper
				.map(getReferenceByIdProgrammingLanguageResult, DeleteProgrammingLanguageResponse.class);

		return deleteProgrammingLanguageResponse;
	}

	// * * * GET METHODS * * *

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {

		List<ProgrammingLanguage> findAllProgrammingLanguageResult = programmingLanguageRepository.findAll();

		return modelMapper.map(findAllProgrammingLanguageResult,
				new TypeToken<List<GetAllProgrammingLanguagesResponse>>() {
				}.getType());
	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(
			GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {

		ProgrammingLanguage getReferenceByIdProgrammingLanguageResult = programmingLanguageRepository
				.getReferenceById(getByIdProgrammingLanguageRequest.getId());

		GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse = modelMapper
				.map(getReferenceByIdProgrammingLanguageResult, GetByIdProgrammingLanguageResponse.class);

		return getByIdProgrammingLanguageResponse;
	}

	// * * * BUSINESS RULES * * *

	private void nameCannotBeSame(String name) throws Exception {

		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getByName(name);

		var result = programmingLanguage;

		if (result != null) {
			throw new Exception(Messages.NAME_ALREADY_EXISTS);
		}
	}
}
