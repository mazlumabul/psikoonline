package scorpion.psikonline.service.abstracts;

import scorpion.psikonline.model.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointment();
    Appointment addAppointment(Appointment appointment);

    Appointment updateAppointment(Appointment appointment);

    void deleteAppointment(int id);

    List<Appointment> findAllAppointment();
}
