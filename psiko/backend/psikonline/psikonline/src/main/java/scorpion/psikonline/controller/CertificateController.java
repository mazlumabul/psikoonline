package scorpion.psikonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import scorpion.psikonline.model.Certificate;
import scorpion.psikonline.service.abstracts.CertificateService;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/Certificate")
public class CertificateController {
    @Autowired
    CertificateService certificateService;
    @GetMapping("/getAllCertificate")
    public List<Certificate> getAllCertificate(){

        return certificateService.getAllCertificate();
    }

    @PostMapping("/createCertificate")
    public Certificate createCertificate(@RequestBody Certificate certificate){
        return certificateService.addCertificate(certificate);
    }

    @DeleteMapping("/removeCertificate/{id}")
    public Certificate deleteCertificate (@RequestParam int Id){
        return this.certificateService.deleteById(Id);
    }

    @PutMapping("/updateCertificate")
    public Certificate updateCertificate(@RequestBody Certificate certificate){
        return certificateService.updateCertificate(certificate);
    }

}
