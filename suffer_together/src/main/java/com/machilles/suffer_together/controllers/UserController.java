package com.machilles.suffer_together.controllers;

import com.machilles.suffer_together.data.entities.Users;
import com.machilles.suffer_together.data.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getUsers(Model model){
        Iterable<Users> users = userRepository.findAll();

        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/users")
    public Users newUser(@RequestBody Users newUser){
        return userRepository.save(newUser);
    }
}
