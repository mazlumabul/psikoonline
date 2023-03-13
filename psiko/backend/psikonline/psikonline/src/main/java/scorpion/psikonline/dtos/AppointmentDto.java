package scorpion.psikonline.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentDto {
    private Date startDate;
    private Date endDate;
    private boolean status;
    private int userId;
}
