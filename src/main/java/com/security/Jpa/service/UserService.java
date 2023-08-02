package com.security.Jpa.service;

import com.security.Jpa.dto.UserDto;
import com.security.Jpa.entity.User;
import com.security.Jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User addUser(UserDto dto){
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());
        user.setRoles(dto.getRoles());
        user.setActive(dto.isActive());
        return userRepository.save(user);
    }


}
