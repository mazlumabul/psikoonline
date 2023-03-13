package scorpion.psikonline.service.abstracts;

import scorpion.psikonline.model.Profession;

import java.util.List;

public interface ProfessionService {
    List<Profession> getAllProfession();
    Profession addProfession(Profession profession);
    Boolean deleteProfession(int id);
    Profession updateProfession(Profession profession);

}
