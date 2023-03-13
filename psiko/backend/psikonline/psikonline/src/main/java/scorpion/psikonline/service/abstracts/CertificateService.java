package scorpion.psikonline.service.abstracts;

import scorpion.psikonline.model.Certificate;

import java.util.List;

public interface CertificateService {
    List<Certificate> getAllCertificate();
    Certificate addCertificate(Certificate certificate);
    Certificate deleteById(int Id);
    Certificate updateCertificate(Certificate certificate);
}
