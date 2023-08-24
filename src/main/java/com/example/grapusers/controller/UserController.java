package com.example.grapusers.controller;

import com.example.grapusers.domain.Users;
import com.example.grapusers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


    @QueryMapping
    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }
}
