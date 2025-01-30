package com.scorestable.restapi.service;

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

//    public Optional<String> authenticate(String username, String password) {
//        return userRepository.findByUsernameAndPassword(username, password).map(user -> user.getUsername());
//    }
}
