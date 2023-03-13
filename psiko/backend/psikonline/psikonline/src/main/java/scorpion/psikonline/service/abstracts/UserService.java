package scorpion.psikonline.service.abstracts;

import java.util.List;

import scorpion.psikonline.core.utilities.results.Result;
import scorpion.psikonline.dtos.UserInputDto;
import scorpion.psikonline.model.User;

public interface UserService {
	List<User> getAllUser();
	User createUser(UserInputDto dto);
	User updateUser(User user);
	User deleteUserById(int id); 
	
	User findByTcknAndPassword(String tckn, String pass);
	List<User> getAllUserWithRole(String role);
	
	User findByEmail(String email);
	
	public Result login (String tckn, String password);
}
