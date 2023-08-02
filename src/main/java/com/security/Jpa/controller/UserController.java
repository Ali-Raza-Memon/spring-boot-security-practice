package com.security.Jpa.controller;

import com.security.Jpa.dto.UserDto;
import com.security.Jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public ResponseEntity<?> addUser(UserDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(userService.addUser(dto));
    }



}
