package com.scorestable.restapi.controller;

import com.scorestable.restapi.model.User;
import com.scorestable.restapi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(User user) {
        return authService.register(user);
    }

//    @GetMapping("/login")
//    public String login() {
//        return authService.login();
//    }
}
