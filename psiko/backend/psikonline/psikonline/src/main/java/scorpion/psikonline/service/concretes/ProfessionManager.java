package scorpion.psikonline.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.Profession;
import scorpion.psikonline.repository.ProfessionRepository;
import scorpion.psikonline.service.abstracts.ProfessionService;

import java.util.List;

@Service
public class ProfessionManager implements ProfessionService {
    @Autowired
    ProfessionRepository professionRepository;
    @Override
    public List<Profession> getAllProfession(){
        return professionRepository.findAll();

    }
    @Override
    public Profession addProfession(Profession profession){

        return professionRepository.save(profession);
    }
    @Override
    public Boolean deleteProfession(int id){
        professionRepository.deleteById(id);
        return true;

    }
    @Override
    public Profession updateProfession(Profession profession){
        Profession newProfession=professionRepository.getById(profession.getId());
        newProfession.setId(profession.getId());
        newProfession.setPsychologistDetails(profession.getPsychologistDetails());
        newProfession.setProfessionName(profession.getProfessionName());

        return professionRepository.save(newProfession);


    }
}
