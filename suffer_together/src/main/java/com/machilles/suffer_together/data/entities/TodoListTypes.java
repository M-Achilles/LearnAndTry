package com.machilles.suffer_together.data.entities;

import javax.persistence.*;

@Entity
@Table(name="TodoListTypes")
public class TodoListTypes {
    @Id
    @Column(name="TodoListType_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoListTypeId;

    @Column(name="TodoListType_Name")
    private String todoListTypeName;

    public String getTodoListTypeName() {
        return todoListTypeName;
    }

    public void setTodoListTypeName(String todoListTypeName) {
        this.todoListTypeName = todoListTypeName;
    }
}
