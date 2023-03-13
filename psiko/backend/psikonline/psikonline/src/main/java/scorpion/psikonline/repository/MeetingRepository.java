package scorpion.psikonline.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import scorpion.psikonline.model.Meeting;


public interface MeetingRepository extends JpaRepository<Meeting, Integer> {
}
