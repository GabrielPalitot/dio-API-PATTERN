package com.learning.taskManager.service.impl;

import com.learning.taskManager.model.Tasks;
import com.learning.taskManager.repositories.TaskRepository;
import com.learning.taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Tasks> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Tasks addTask(Tasks task) {
        taskRepository.save(task);
        return task;
    }

    @Override
    public Tasks updateTask(Tasks task) {
        Optional<Tasks> taskBd = taskRepository.findById(task.getId());
        if (taskBd.isPresent()) {
            taskRepository.save(task);
            return task;
        }
        return null;
    }

    @Override
    public void deleteTaskById(Long id) {
        Optional<Tasks> taskBd = taskRepository.findById(id);
        if (taskBd.isPresent()) {
            taskRepository.deleteById(id);
        }
    }
}
