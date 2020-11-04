package com.machilles.suffer_together.data.entities;

import javax.persistence.*;
import java.util.List;

public class TodoLists {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TodoList_Id")
    private long todoListId;

    @Column(name="TodoList_Name",nullable = false)
    private String todoListName;

    @Column(name="TodoList_State")
    private boolean todoListState;

    @OneToMany(mappedBy = "todoList")
    private List<Todos> todos;

    @ManyToMany(mappedBy = "todoLists")
    private List<Users> users;
}
