package com.taskmanager.task_manager.controller;

import com.taskmanager.task_manager.domain.Task;
import com.taskmanager.task_manager.domain.TaskStatus;
import com.taskmanager.task_manager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;
    
    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAll(); 
    }
    
    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getById(id);
    }
    
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody CreateTaskRequest taskRequest) {
        var task = taskService.create(taskRequest.title());
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }
    
    @PatchMapping("/{id}/status")
    public Task updateStatus(@PathVariable Long id, @RequestParam TaskStatus status) {
        return taskService.updateStatus(id, status);
    }
}
