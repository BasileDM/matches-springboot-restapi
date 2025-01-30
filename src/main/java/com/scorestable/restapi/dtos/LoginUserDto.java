package com.scorestable.restapi.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class LoginUserDto {
    private String email;

    private String password;
}
