package com.taskmanager.task_manager.service;

import com.taskmanager.task_manager.domain.Task;
import com.taskmanager.task_manager.domain.TaskStatus;
import com.taskmanager.task_manager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task getById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found: " + id));
    }

    public Task create(String title) {
        var task = new Task(title, TaskStatus.NEW);
        return taskRepository.save(task);
    }

    public Task updateStatus(Long id, TaskStatus status) {
        var task = getById(id);
        task.setStatus(status);
        return taskRepository.save(task);
    }
}
