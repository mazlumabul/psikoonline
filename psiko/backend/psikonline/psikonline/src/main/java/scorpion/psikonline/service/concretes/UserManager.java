package scorpion.psikonline.service.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scorpion.psikonline.core.utilities.results.ErrorResult;
import scorpion.psikonline.core.utilities.results.Result;
import scorpion.psikonline.core.utilities.results.SuccessResult;
import scorpion.psikonline.dtos.UserInputDto;
import scorpion.psikonline.model.User;
import scorpion.psikonline.repository.UserRepository;
import scorpion.psikonline.service.abstracts.UserService;

@Service
public class UserManager implements UserService {

	@Autowired
	UserRepository userRepository;
	ModelMapper modelMapper;
	
	@Override
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	@Override
	public User createUser(UserInputDto dto) {
		User newUser=new User();
		BeanUtils.copyProperties(dto, newUser);
		return this.userRepository.save(newUser);
		 
	}

	@Override
	public User deleteUserById(int id) {
		return this.userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user) {
		User newUser=userRepository.getById(user.getId());
		newUser.setTckn(user.getTckn());
		newUser.setName(user.getName());
		newUser.setLastName(user.getLastName());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		return userRepository.save(newUser);
	}

	@Override
	public List<User> getAllUserWithRole(String role){
		return userRepository.getByRole(role);
	}

	@Override
	public User findByTcknAndPassword(String tckn, String pass) {
		return userRepository.getByTcknAndPassword(tckn, pass);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public Result login(String tckn, String password) {
		User existUser = userRepository.findByTckn(tckn);
		if((existUser.getTckn().equals(tckn)) && (existUser.getPassword().equals(password))) {
			return new SuccessResult("Giriş başarılı");
		}else {
			return new ErrorResult("Bilgilerinizi kontrol ediniz");
		} 
		
	}
}
