package com.machilles.suffer_together.data.repositories;

import com.machilles.suffer_together.data.entities.TodoTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoTypeRepository extends CrudRepository<TodoTypes, Long> {
}
