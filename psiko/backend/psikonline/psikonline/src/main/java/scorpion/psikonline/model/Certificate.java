package scorpion.psikonline.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
@Data
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @ManyToOne(targetEntity = PsychologistDetails.class)
    @JoinColumn(referencedColumnName = "id")
    private PsychologistDetails psychologistDetails;
    
    private String certificateName;
    
    private String certificateDescription;
    
    private Date certificateDate;

}
