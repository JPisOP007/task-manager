package com.example.taskmanager.controller;

import com.example.taskmanager.entity.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private TaskRepository repo;

    // Show UI
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", repo.findAll());
        return "index";
    }

    // Add task
    @PostMapping("/add")
    public String addTask(@RequestParam String title) {
        Task t = new Task();
        t.setTitle(title);
        repo.save(t);
        return "redirect:/";
    }

    // Delete task
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
