package com.outside.theconnect.service;

import com.outside.theconnect.domain.User;
import com.outside.theconnect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getByEmail(String email) {
        return userRepository.findById(email).orElse(null);
    }
}
