package com.example.demo.entities.repositories;

import com.example.demo.entities.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    
}