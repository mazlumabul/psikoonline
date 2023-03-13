package scorpion.psikonline.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import scorpion.psikonline.core.utilities.results.Result;
import scorpion.psikonline.dtos.UserInputDto;
import scorpion.psikonline.model.User;
import scorpion.psikonline.service.abstracts.UserService;

@RequestMapping("/User")
@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@PostMapping("/createUser")
	public User createUser( @Valid @RequestBody UserInputDto dto) {
		return userService.createUser(dto);
	}
	
	@DeleteMapping("/removeUser")
	public User deleteUser(int id) {
		return this.userService.deleteUserById(id);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("getAllUserWithRole")
	public List<User> getAllUserWithRole(@RequestParam String role){
		return userService.getAllUserWithRole(role);
	}
	
	@GetMapping("/checkUser")
	public User findByTcknAndPassword(@RequestParam String tckn, @RequestParam String pass) {
		return userService.findByTcknAndPassword(tckn, pass);
	}
	
	@GetMapping("/login/{tckn}")
	public Result login(@PathVariable("tckn") String tckn, String password) {
		return this.userService.login(tckn,password);
	}
	
}
