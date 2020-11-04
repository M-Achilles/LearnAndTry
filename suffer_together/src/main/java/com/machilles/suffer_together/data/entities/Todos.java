package com.machilles.suffer_together.data.entities;

import javax.persistence.*;

public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Todo_Id")
    private long todoId;

    @Column(name="Todo_Description",nullable = false)
    private String todoDescription;

    @Column(name="Todo_State")
    private boolean todoState;

    @ManyToOne
    @JoinColumn(name="TodoType_Id")
    private TodoTypes todoType;

    @ManyToOne
    @JoinColumn(name="TodoList_Id")
    private TodoLists todoList;


}
