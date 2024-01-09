package com.resotechtaskmang.services;

import com.resotechtaskmang.entities.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task updateTask(Long id, Task task);
    void deleteTask(Long id);

    void doneTask(Long id);
}
