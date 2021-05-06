package project.gabrielmedeiros.breakfastmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.gabrielmedeiros.breakfastmanager.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

}
