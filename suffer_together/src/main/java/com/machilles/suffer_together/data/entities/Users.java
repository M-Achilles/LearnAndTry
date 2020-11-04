package com.machilles.suffer_together.data.entities;

import javax.persistence.*;
import java.util.List;

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_Id")
    private long userId;

    @Column(name="User_Name",unique = true,nullable = false)
    private String userName;

    @ManyToOne
    @JoinTable(name = "user_todoLists",
    joinColumns = @JoinColumn(name = "User_Id", referencedColumnName = "User_Id"),
    inverseJoinColumns = @JoinColumn(name = "TodoList_Id",
            referencedColumnName = "TodoList_Id"))
    private List<TodoLists> todoLists;
}
