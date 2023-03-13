package scorpion.psikonline.repository;

import scorpion.psikonline.model.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	
}