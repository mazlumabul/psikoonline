package scorpion.psikonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import scorpion.psikonline.model.PsychologistDetails;
import scorpion.psikonline.service.abstracts.PsychologistDetailsService;

@RestController
@CrossOrigin
@RequestMapping("/psychologistDetails")
public class PsychologistDetailsController {

	@Autowired
	PsychologistDetailsService psyDetailsService;
	
	@GetMapping("/getAllpsychologistDetails")
	public List<PsychologistDetails> getAllPsychologistDetails(){
		return psyDetailsService.getAllPsychologistDetails();
	}
	
	@PostMapping("/addPsychologistDetails")
	public PsychologistDetails createPsychologistDetails(@RequestBody PsychologistDetails psychologistDetails) {
		return psyDetailsService.createPsychologistDetails(psychologistDetails);
	}
	
	@PutMapping("/updatePsychologistDetails")
	public PsychologistDetails updatePsychologistDetails(@RequestBody PsychologistDetails psychologistDetails) {
		return psyDetailsService.updatePsychologistDetails(psychologistDetails);
	}

	@DeleteMapping("/deletePsychologistDetails")
	public void deletePsychologistDetails(@RequestParam int id) {
		psyDetailsService.deletePsychologistDetails(id);

	}
}
