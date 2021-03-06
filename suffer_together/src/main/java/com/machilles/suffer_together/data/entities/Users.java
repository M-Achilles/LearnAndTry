package com.machilles.suffer_together.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_Id")
    private long userId;

    @Column(name="User_Name",nullable = false)
    private String userName;

    @OneToMany
    @JoinTable(name = "user_todoLists",
    joinColumns = @JoinColumn(name = "User_Id", referencedColumnName = "User_Id"),
    inverseJoinColumns = @JoinColumn(name = "TodoList_Id",
            referencedColumnName = "TodoList_Id"))
    private List<TodoLists> todoLists;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<TodoLists> getTodoLists() {
        return todoLists;
    }

    public void setTodoLists(List<TodoLists> todoLists) {
        this.todoLists = todoLists;
    }
}
