package scorpion.psikonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scorpion.psikonline.model.Education;

public interface EducationRepository extends JpaRepository<Education,Integer> {

	Education deleteById(int Id);

}
