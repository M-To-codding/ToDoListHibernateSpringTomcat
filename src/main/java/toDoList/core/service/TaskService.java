package toDoList.core.service;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
    public List<Task> getAll();
    public void createTask(Task task);
<<<<<<< HEAD
    public void update(Task task);
    public List<Task> getActive(String listId);
    public List<Task> getDone(String listId);
    public void deleteTask(String taskId);

=======
    public void deleteTask(Integer taskId);
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
}
