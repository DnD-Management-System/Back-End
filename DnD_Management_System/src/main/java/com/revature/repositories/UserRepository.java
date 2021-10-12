package com.revature.repositories;

import org.springframework.stereotype.Repository;
import com.revature.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

	//public User findByUserusername(String username);
	
}
