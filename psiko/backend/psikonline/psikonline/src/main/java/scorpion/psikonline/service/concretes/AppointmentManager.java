package scorpion.psikonline.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.Appointment;
import scorpion.psikonline.repository.AppointmentRepository;
import scorpion.psikonline.service.abstracts.AppointmentService;

import java.util.List;

@Service
public class AppointmentManager implements AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointment() {

        return appointmentRepository.findAll();
    }

    @Override
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        Appointment newAppointment = appointmentRepository.getById(appointment.getId());
        newAppointment.setId(appointment.getId());
        newAppointment.setStartDate(appointment.getStartDate());
        newAppointment.setEndDate(appointment.getEndDate());
        newAppointment.setStatus(appointment.isStatus());
        newAppointment.setUserId(appointment.getUserId());
        return appointmentRepository.save(newAppointment);
    }

    @Override
    public void deleteAppointment(int id) {
        appointmentRepository.deleteById(id);
    }

    @Override
    public List<Appointment> findAllAppointment() {
        return appointmentRepository.findAll();
    }
}
