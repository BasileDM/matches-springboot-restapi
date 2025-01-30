package com.scorestable.restapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    @Getter
    private String token;

    private long expiresIn;

}