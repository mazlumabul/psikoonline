package scorpion.psikonline.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@NotNull(message = "Tc Kimlik alanı boş olamaz")
	private String tckn;
	
	@NotBlank(message = "İsim alanı boş olamaz")
	private String name;
	
	@NotBlank(message = "Soyad alanı boş olamaz")
	private String lastName;
	
	@Email
	@NotBlank(message = "Email alanı boş olamaz")
	private String email;
	
	@NotBlank(message = "Şifre Alanı boş olamaz")
	private String password;
	
	private String role;
	
	public enum role{
		psychologist, patient;
	}
}
