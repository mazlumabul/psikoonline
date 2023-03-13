package scorpion.psikonline.service.abstracts;

import scorpion.psikonline.model.Meeting;

import java.util.List;

public interface MeetingService {
    List<Meeting> getAllMeeting();
    Meeting addMeeting(Meeting meeting);
    Meeting updateMeeting(Meeting meeting);
    void deleteMeeting(int id);
    List<Meeting> findAllMeeting();
}
