package com.machilles.suffer_together.data.repositories;

import com.machilles.suffer_together.data.entities.TodoLists;
import com.machilles.suffer_together.data.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRepository extends CrudRepository<TodoLists, Long> {
    Iterable<TodoLists> findByUsersIn(List<Users> users);
}
