package scorpion.psikonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import scorpion.psikonline.model.Meeting;
import scorpion.psikonline.service.abstracts.MeetingService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Meeting")
public class MeetingController {
    @Autowired
    MeetingService meetingService;
    @GetMapping("/getAllMeeting")
    public List<Meeting> getAllMeeting(){
        return meetingService.getAllMeeting();
    }

    @PostMapping("/createMeeting")
    public Meeting createMeeting(@RequestBody Meeting meeting){
        return meetingService.addMeeting(meeting);
    }

}
