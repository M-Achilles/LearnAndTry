package com.machilles.suffer_together.controllers;

import com.machilles.suffer_together.data.entities.Users;
import com.machilles.suffer_together.data.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        Iterable<Users> users = userRepository.findAll();

        model.addAttribute("user", new Users());
        model.addAttribute("users", users);
        return "users";
    }

    @PostMapping("/users")
    public String newUser(@ModelAttribute("user") Users newUsers, Model model){
        userRepository.save(newUsers);

        //Todo: Enhance sloppy redirecting to page for refresh of model
        String url = "redirect:/users/";
        return url;
    }
}
