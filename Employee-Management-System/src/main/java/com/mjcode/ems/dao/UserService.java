package com.mjcode.ems.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mjcode.ems.dto.UserRegistrationDto;
import com.mjcode.ems.entity.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
