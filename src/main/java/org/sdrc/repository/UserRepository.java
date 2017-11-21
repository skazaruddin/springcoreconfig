package org.sdrc.repository;

import org.sdrc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByUserName(String username);

	

}
