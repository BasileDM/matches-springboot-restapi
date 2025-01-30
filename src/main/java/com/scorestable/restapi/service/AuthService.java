package com.scorestable.restapi.service;

import com.scorestable.restapi.model.User;
import com.scorestable.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    private final UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }

//    public User login(User user) {
//        return userRepository.findByUsername(user.getUsername()).orElse(null);
//    }
}
