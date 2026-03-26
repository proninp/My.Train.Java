package com.taskmanager.task_manager.repository;

import com.taskmanager.task_manager.domain.Task;
import com.taskmanager.task_manager.domain.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
