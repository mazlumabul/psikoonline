package scorpion.psikonline.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    @ManyToOne(targetEntity = PsychologistDetails.class)
    @JoinColumn(referencedColumnName = "id")
    private PsychologistDetails psychologistDetails;
    
    private String schoolName;
    
    private String department;
    
    private String degree;
    
    private Date startedDate;
    
    private Date endedDate;





}
