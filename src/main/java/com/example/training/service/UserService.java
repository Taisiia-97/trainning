package com.example.training.service;


import com.example.training.domain.User;
import com.example.training.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


   public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user) {
       return userRepository.save(user);
    }
}
