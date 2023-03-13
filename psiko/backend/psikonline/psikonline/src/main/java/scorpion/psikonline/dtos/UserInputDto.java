package scorpion.psikonline.dtos;


import lombok.Data;

@Data
public class UserInputDto {

	private int id;
	private String tckn;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String role;
}
