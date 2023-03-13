package scorpion.psikonline.service.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.model.Meeting;
import scorpion.psikonline.repository.MeetingRepository;
import scorpion.psikonline.service.abstracts.MeetingService;

import java.util.List;

@Service
public class MeetingManager implements MeetingService {
    @Autowired
    MeetingRepository meetingRepository;

    @Override
    public List<Meeting> getAllMeeting(){
        return meetingRepository.findAll();
    }
    @Override
    public Meeting addMeeting(Meeting meeting){
        return meetingRepository.save(meeting);
    }
    @Override
    public Meeting updateMeeting(Meeting meeting){
        Meeting newMeeting = meetingRepository.getById(meeting.getId());
        newMeeting.setId(meeting.getId());
        newMeeting.setStartTime(meeting.getStartTime());
        newMeeting.setEndTime(meeting.getEndTime());
        newMeeting.setMeetingLink(meeting.getMeetingLink());
        newMeeting.setUserId(meeting.getUserId());
        return meetingRepository.save(newMeeting);
    }
    @Override
    public void deleteMeeting(int id){
        meetingRepository.deleteById(id);
    }


    @Override
    public List<Meeting> findAllMeeting(){
        return meetingRepository.findAll();
    }

}
