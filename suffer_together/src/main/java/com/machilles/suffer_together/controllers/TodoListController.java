package com.machilles.suffer_together.controllers;

import com.machilles.suffer_together.data.entities.TodoLists;
import com.machilles.suffer_together.data.entities.Users;
import com.machilles.suffer_together.data.repositories.TodoListRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoListController {
    private final TodoListRepository todoListRepository;

    TodoListController(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @GetMapping("/todolists")
    public String getTodoLists(@ModelAttribute("user") Users users,Model model){
        List<Users> userList = new ArrayList<Users>();
        userList.add(users);

        Iterable<TodoLists> todoLists = todoListRepository.findByUsersIn(userList);
        model.addAttribute("todolists", todoLists);

        return "todolists";
    }
}
