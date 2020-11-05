package com.machilles.suffer_together.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TodoTypes")
public class TodoTypes {
    @Id
    @Column(name="TodoType_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoTypeId;

    @Column(name ="TodoType_Name",nullable = false)
    private String todoTypeName;

    @OneToMany(mappedBy = "todoType")
    private List<Todos> todos;

    public String getTodoTypesName() {
        return todoTypeName;
    }

    public void setTodoTypesName(String todoTypesName) {
        this.todoTypeName = todoTypesName;
    }

    public List<Todos> getTodos() {
        return todos;
    }

    public void setTodos(List<Todos> todos) {
        this.todos = todos;
    }
}
