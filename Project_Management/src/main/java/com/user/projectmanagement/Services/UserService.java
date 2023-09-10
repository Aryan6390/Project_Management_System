package com.user.projectmanagement.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.content.projectmanagement.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    // Implement methods for user registration, login, etc.
}