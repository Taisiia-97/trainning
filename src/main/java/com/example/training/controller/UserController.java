package com.example.training.controller;


import com.example.training.domain.User;
import com.example.training.dto.UserDto;
import com.example.training.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody UserDto userDto){
        User user = new User(userDto.getId(),userDto.getFirstName(),userDto.getLastName());
        return  userService.createUser(user);
    }
}
