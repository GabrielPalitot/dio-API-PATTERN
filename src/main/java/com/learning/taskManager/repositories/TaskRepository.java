package com.learning.taskManager.repositories;

import com.learning.taskManager.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks,Long> {}
