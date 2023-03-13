package scorpion.psikonline.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class EducationDto {
    private int psychologistDetailId;
    private String schoolName;
    private String department;
    private String degree;
    private Date startedDate;
    private Date endedDate;
}
