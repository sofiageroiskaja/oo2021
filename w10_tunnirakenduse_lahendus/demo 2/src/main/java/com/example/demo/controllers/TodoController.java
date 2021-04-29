package com.example.demo.controllers;

import com.example.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TodoController {
    
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
      }    
    @GetMapping("/alltodos")
    public String showAllTodos(Model model) {
        model.addAttribute("users", todoRepository.findAll());
        return "alltodos";
    }
}