package core.service;

import core.Task;

import java.util.List;

/**
 * Created by Я on 24.11.2016.
 */
public interface TaskService {
    public List<Task> getTasks();
    void addTask(Task task);
    Task getTask(Long id);
    void updateTask(Task task);
    void deleteTask(Long id);
}
