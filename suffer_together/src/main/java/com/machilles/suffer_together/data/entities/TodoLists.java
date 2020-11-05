package com.machilles.suffer_together.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TodoLists")
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

    public String getTodoListName() {
        return todoListName;
    }

    public void setTodoListName(String todoListName) {
        this.todoListName = todoListName;
    }

    public boolean isTodoListState() {
        return todoListState;
    }

    public void setTodoListState(boolean todoListState) {
        this.todoListState = todoListState;
    }

    public List<Todos> getTodos() {
        return todos;
    }

    public void setTodos(List<Todos> todos) {
        this.todos = todos;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
