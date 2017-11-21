package org.sdrc.service;

import org.sdrc.domain.User;

public interface UserService {

	User findByUsername(String userName);
	
}
