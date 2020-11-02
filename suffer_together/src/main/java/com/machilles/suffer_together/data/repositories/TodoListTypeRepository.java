package com.machilles.suffer_together.data.repositories;

import com.machilles.suffer_together.data.entities.TodoListTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListTypeRepository extends CrudRepository<TodoListTypes, Long> {
}
