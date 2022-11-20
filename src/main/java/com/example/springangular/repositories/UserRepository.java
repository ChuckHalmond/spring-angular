package com.example.springangular.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springangular.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}