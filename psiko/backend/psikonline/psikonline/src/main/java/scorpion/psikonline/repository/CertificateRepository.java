package scorpion.psikonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scorpion.psikonline.model.Certificate;


public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

	Certificate deleteById(int Id);
	
}
