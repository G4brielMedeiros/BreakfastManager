package project.gabrielmedeiros.breakfastmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.gabrielmedeiros.breakfastmanager.entity.User;
import project.gabrielmedeiros.breakfastmanager.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private final UserRepository userRepository;
	
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
    	return (List<User>) userRepository.findAll();
    }
    
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
    	userRepository.save(user);
    }
    
    @PutMapping("/users/{cpf}")
    void updateUser(@RequestBody User user, @PathVariable String cpf ) {
    	userRepository.save(user);
    }
    
    @DeleteMapping("users/delete/{cpf}")
    public void deleteUser(@PathVariable String cpf) {
    	userRepository.deleteById(cpf);
    }
}
