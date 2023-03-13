package scorpion.psikonline.service.abstracts;

import scorpion.psikonline.model.Education;

import java.util.List;

public interface EducationService {
    List<Education> getAllEducation();
    Education addCertificate(Education education);
    Education deleteById(int Id);
    Education UpdateEducation(Education education);
}
