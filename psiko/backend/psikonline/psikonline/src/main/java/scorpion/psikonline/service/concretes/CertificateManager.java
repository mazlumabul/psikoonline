package scorpion.psikonline.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.Certificate;
import scorpion.psikonline.repository.CertificateRepository;
import scorpion.psikonline.service.abstracts.CertificateService;

import java.util.List;

@Service
public class CertificateManager implements CertificateService {
    @Autowired
    CertificateRepository certificateRepository;

    @Override
    public List<Certificate> getAllCertificate(){
        return certificateRepository.findAll();

    }
    @Override
    public Certificate addCertificate(Certificate certificate){

        return certificateRepository.save(certificate);
    }
    @Override
    public Certificate deleteById(int Id){
       return this.certificateRepository.deleteById(Id);

    }
    @Override
    public Certificate updateCertificate(Certificate certificate){ // kontrol et
        Certificate newCertificate=certificateRepository.getById(certificate.getId());
        newCertificate.setId(certificate.getId());
        newCertificate.setCertificateName(certificate.getCertificateName());
        newCertificate.setCertificateDate(certificate.getCertificateDate());
        newCertificate.setPsychologistDetails(certificate.getPsychologistDetails());
        newCertificate.setCertificateDescription(certificate.getCertificateDescription());

        return certificateRepository.save(newCertificate);

    }
}
