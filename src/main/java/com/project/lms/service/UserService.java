package com.project.lms.service;

import com.project.lms.controller.dto.UserRegistrationDto;
import com.project.lms.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
