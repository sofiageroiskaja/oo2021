package com.example.demo.controllers;

import javax.validation.Valid;
import com.example.demo.entities.ToDo;
import com.example.demo.entities.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoController {
    
    private final ToDoRepository todoRepository;

    @Autowired
    public ToDoController(ToDoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/index")
    public String showToDolist(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showAdd(ToDo todo){
        return "add";
    }

    @PostMapping("/addToDo")
    public String addToDo(@Valid ToDo todo, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add";
        }

        todoRepository.save(todo);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdate(@PathVariable("id") long id, Model model){
        ToDo todo = todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No such ToDo with id " + id));
        model.addAttribute("todo", todo);
        return "update";    
    }

    @PostMapping("/update/{id}")
    public String updateToDo(@PathVariable("id") long id, @Valid ToDo todo, BindingResult result, Model model){
        if(result.hasErrors()){
            return "update";
        }
        todoRepository.save(todo);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteToDo(@PathVariable("id") long id, Model model){
        ToDo todo = todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No such Todo with id " + id));

        todoRepository.delete(todo);
        return "redirect:/index";
    }
}
