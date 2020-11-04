package com.machilles.suffer_together.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<com.machilles.suffer_together.data.entities.Users, Long> {
}
