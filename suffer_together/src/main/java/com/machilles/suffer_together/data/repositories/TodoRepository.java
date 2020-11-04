package com.machilles.suffer_together.data.repositories;

import com.machilles.suffer_together.data.entities.Todos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todos,Long> {
}
