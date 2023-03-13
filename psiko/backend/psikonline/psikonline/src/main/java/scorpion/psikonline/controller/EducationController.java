package scorpion.psikonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import scorpion.psikonline.model.Education;
import scorpion.psikonline.service.abstracts.EducationService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Education")

public class EducationController {
    @Autowired
    EducationService educationService;
    @GetMapping("/getAllEducation")
    public List<Education> getAllEducation(){

        return educationService.getAllEducation();
    }

    @PostMapping("/CreateEducation")
    public Education CreateEducation(@RequestBody Education education){
        return educationService.addCertificate(education);
    }
    
    public Education deleteEducationById(int Id) {
    	return this.educationService.deleteById(Id);
    }

}
