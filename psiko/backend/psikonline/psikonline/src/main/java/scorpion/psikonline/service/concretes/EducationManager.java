package scorpion.psikonline.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.Education;
import scorpion.psikonline.repository.EducationRepository;
import scorpion.psikonline.service.abstracts.EducationService;

import java.util.List;

@Service
public class EducationManager implements EducationService {
    @Autowired
    EducationRepository educationRepository;

    @Override
    public List<Education> getAllEducation(){
        return educationRepository.findAll();

    }
    @Override
    public Education addCertificate(Education education){

        return educationRepository.save(education);
    }
    @Override
    public Education deleteById(int Id){
       return this.educationRepository.deleteById(Id);

    }
    @Override
    public Education UpdateEducation(Education education){

        Education newEducation =educationRepository.getById(education.getId());
        newEducation.setId(education.getId());
        newEducation.setPsychologistDetails(education.getPsychologistDetails());
        newEducation.setDepartment(education.getDepartment());
        newEducation.setSchoolName(education.getSchoolName());
        newEducation.setDegree(education.getDegree());
        newEducation.setStartedDate(education.getStartedDate());
        newEducation.setEndedDate(education.getEndedDate());


        return educationRepository.save(newEducation);
    }

}
