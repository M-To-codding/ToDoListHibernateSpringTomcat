package toDoList.core.service;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
    public List<Task> getAll();
    public void createTask(Task task);
    public void deleteTask(Integer taskId);
}
