package com.learning.taskManager.controllers;

import com.learning.taskManager.model.Tasks;
import com.learning.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Tasks> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Tasks> getTaskById(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public Tasks createTask(@RequestBody Tasks task) {
        return taskService.addTask(task);
    }

    @PutMapping
    public Tasks updateTask(@RequestBody Tasks task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
         taskService.deleteTaskById(id);
    }

}
