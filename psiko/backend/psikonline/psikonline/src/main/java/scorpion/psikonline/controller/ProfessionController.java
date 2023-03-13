package scorpion.psikonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import scorpion.psikonline.model.Profession;
import scorpion.psikonline.service.abstracts.ProfessionService;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Profession")
public class ProfessionController {
    @Autowired
    ProfessionService professionService;
    @GetMapping("/getAllProfession")
    public List<Profession> getAllProfession(){

        return professionService.getAllProfession();
    }
    @PostMapping("/CreateProfession")
    public Profession CreateProfession(@RequestBody Profession profession){
        return professionService.addProfession(profession);
    }
}
