package scorpion.psikonline.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.PsychologistDetails;
import scorpion.psikonline.repository.PsychologistDetailsRepository;
import scorpion.psikonline.service.abstracts.PsychologistDetailsService;

@Service
public class PsychologistDetailsManager implements PsychologistDetailsService {

	@Autowired
	private PsychologistDetailsRepository psyDetailsRepository;

	@Override
	public List<PsychologistDetails> getAllPsychologistDetails() {
		return psyDetailsRepository.findAll();
	}

	@Override
	public PsychologistDetails createPsychologistDetails(PsychologistDetails psychologistDetails) {
	        return psyDetailsRepository.save(psychologistDetails);
	        
	}

	@Override
	public PsychologistDetails updatePsychologistDetails(PsychologistDetails psychologistDetails) {
		PsychologistDetails newPsyDetails=psyDetailsRepository.getById(psychologistDetails.getId());
		newPsyDetails.setGrade(psychologistDetails.getGrade());
		newPsyDetails.setResume(psychologistDetails.getResume());
		newPsyDetails.setPhoto(psychologistDetails.getPhoto());
		return psyDetailsRepository.save(newPsyDetails);
	}

	@Override
	public void deletePsychologistDetails(int id) {
		 psyDetailsRepository.deleteById(id);

	}
}
