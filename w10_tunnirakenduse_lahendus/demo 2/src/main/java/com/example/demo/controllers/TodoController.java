package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.Todo;
import com.example.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TodoController {
    
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/alltodos")
    public String showAllTodos(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "alltodos";
    }

    @GetMapping("/addtodo")
    public String showAddTodo(Todo todo){
        return "addtodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(@Valid Todo todo, BindingResult result, Model model){
        if (result.hasErrors()){
            return "addtodo";
          }
      
          todoRepository.save(todo);
          return "redirect:/alltodos";
    }

    @GetMapping("/edit/{id}")
    public String showUpdate(@PathVariable("id") long id, Model model){
        Todo todo = todoRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("No such todo with id " + id));
        model.addAttribute("todo", todo);
    
        return "update";
    }

    @PostMapping("/update/{id}")
    public String updateTodo(@PathVariable("id") long id, @Valid Todo todo, BindingResult result, Model model){
    if (result.hasErrors()){
      return "update";
    }

    todoRepository.save(todo);
    return "redirect:/alltodos";
  }

  @GetMapping("/delete/{id}")
  public String deleteTodo(@PathVariable("id") long id, Model model){
    Todo todo = todoRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such todo with id " + id));

    todoRepository.delete(todo);

    return "redirect:/alltodos";
  }
}