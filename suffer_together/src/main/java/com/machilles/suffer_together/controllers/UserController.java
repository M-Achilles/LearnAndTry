package com.machilles.suffer_together.controllers;

import com.machilles.suffer_together.data.entities.Users;
import com.machilles.suffer_together.data.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    Iterable<Users> all(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    Users newUser(@RequestBody Users newUser){
        return userRepository.save(newUser);
    }
}
