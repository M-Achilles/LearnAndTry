package com.machilles.suffer_together.data.repositories;

import com.machilles.suffer_together.data.entities.TodoLists;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends CrudRepository<TodoLists, Long> {
}
