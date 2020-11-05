package com.machilles.suffer_together.data.entities;

import javax.persistence.*;

@Entity
@Table(name="Todos")
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Todo_Id")
    private long todoId;

    @Column(name="Todo_Description",nullable = false)
    private String todoDescription;

    @Column(name="Todo_State")
    private boolean todoState;

    public String getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(String todoDescription) {
        this.todoDescription = todoDescription;
    }

    public boolean isTodoState() {
        return todoState;
    }

    public void setTodoState(boolean todoState) {
        this.todoState = todoState;
    }

    public TodoTypes getTodoType() {
        return todoType;
    }

    public void setTodoType(TodoTypes todoType) {
        this.todoType = todoType;
    }

    public TodoLists getTodoList() {
        return todoList;
    }

    public void setTodoList(TodoLists todoList) {
        this.todoList = todoList;
    }

    @ManyToOne
    @JoinColumn(name="TodoType_Id")
    private TodoTypes todoType;

    @ManyToOne
    @JoinColumn(name="TodoList_Id")
    private TodoLists todoList;


}
