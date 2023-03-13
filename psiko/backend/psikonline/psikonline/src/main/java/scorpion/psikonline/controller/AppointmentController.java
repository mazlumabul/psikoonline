package scorpion.psikonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import scorpion.psikonline.model.Appointment;
import scorpion.psikonline.service.abstracts.AppointmentService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping("/getAllAppointment")
    public List<Appointment> getAllAppointment(){
        return appointmentService.getAllAppointment();
    }

    @PostMapping("/createAppointment")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentService.addAppointment(appointment);
    }
}