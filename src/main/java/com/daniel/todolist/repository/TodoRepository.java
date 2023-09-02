package com.daniel.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}