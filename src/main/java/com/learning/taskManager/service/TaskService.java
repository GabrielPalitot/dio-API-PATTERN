package com.learning.taskManager.service;


import com.learning.taskManager.model.Tasks;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Tasks> getAllTasks();
    Optional<Tasks> getTaskById(Long id);
    Tasks addTask(Tasks task);
    Tasks updateTask(Tasks task);
    void deleteTaskById(Long id);
}
