package scorpion.psikonline.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import scorpion.psikonline.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User deleteById(int id);
	List<User> getByRole(String role);
	User getByTcknAndPassword(String tckn, String pass);
	User findByTckn(String tckn);
	User findByEmail (String email);
}
