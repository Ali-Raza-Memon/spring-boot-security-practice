package com.security.Jpa.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private int Id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;
}
