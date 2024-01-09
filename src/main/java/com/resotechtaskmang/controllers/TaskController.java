package com.resotechtaskmang.controllers;

import com.resotechtaskmang.dtos.TaskDto;
import com.resotechtaskmang.entities.Task;
import com.resotechtaskmang.services.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @Autowired
    private ModelMapper modelMapper;


    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        List<TaskDto> taskDtos = tasks.stream()
                .map(task -> modelMapper.map(task, TaskDto.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(taskDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        TaskDto taskDto = modelMapper.map(task, TaskDto.class);
        return new ResponseEntity<>(taskDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto) {
        Task task = modelMapper.map(taskDto, Task.class);
        Task createdTask = taskService.createTask(task);
        TaskDto newTaskDto = modelMapper.map(createdTask, TaskDto.class);
        return new ResponseEntity<>(newTaskDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskDto> updateTask(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        Task task = modelMapper.map(taskDto, Task.class);
        Task updatedTask = taskService.updateTask(id, task);
        TaskDto updatedTaskDto = modelMapper.map(updatedTask, TaskDto.class);
        return new ResponseEntity<>(updatedTaskDto, HttpStatus.OK);
    }

    @PostMapping("/done/{id}")
    public ResponseEntity<Integer> doneTask(@PathVariable Long id) {
        taskService.doneTask(id);
        return new ResponseEntity<>(1,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/login")
    public ResponseEntity<Integer> login(){
        return new ResponseEntity<>(1, HttpStatus.OK);
    }
}

