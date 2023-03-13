package scorpion.psikonline.service.abstracts;

import java.util.List;

import scorpion.psikonline.model.PsychologistDetails;

public interface PsychologistDetailsService {
	List<PsychologistDetails> getAllPsychologistDetails();
	PsychologistDetails createPsychologistDetails(PsychologistDetails psychologistDetails);
	PsychologistDetails updatePsychologistDetails(PsychologistDetails psychologistDetails);
	void deletePsychologistDetails(int id);
}

