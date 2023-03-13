package scorpion.psikonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scorpion.psikonline.model.Profession;
import scorpion.psikonline.model.User;


public interface ProfessionRepository extends JpaRepository<Profession, Integer> {

	User deleteById(int id);
	
}
