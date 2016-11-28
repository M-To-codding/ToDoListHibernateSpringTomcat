package toDoList.core.service;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
    public List<Task> getAll();
    public void createTask(Task task);
    public void update(Task task);
    public List<Task> getActive(String listId);
    public List<Task> getDone(String listId);
    public void deleteTask(String taskId);

}
