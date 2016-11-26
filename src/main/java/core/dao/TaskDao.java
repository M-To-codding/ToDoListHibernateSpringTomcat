package core.dao;

import core.Task;

import java.util.List;


public interface TaskDao {
    List<Task> getTasks();

    void addTask(Task task);

    Task getTask(Long id);

    void updateTask(Task task);

    void deleteTask(Long id);
}