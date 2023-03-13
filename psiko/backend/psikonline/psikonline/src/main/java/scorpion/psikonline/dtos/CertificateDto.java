package scorpion.psikonline.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CertificateDto {
    private int psychologistDetailId;
    private String certificateName;
    private String certificateDescription;
    private Date certificateDate;
}
