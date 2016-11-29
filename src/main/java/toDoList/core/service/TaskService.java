package toDoList.core.service;

import toDoList.core.model.Task;
import toDoList.core.tasks.TasksSwitcher;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
    public TasksSwitcher getAllTasks();

    public TasksSwitcher getAllTasks(String listId);

    public void addNewTask(String name, String listId);

    public void deleteTask(String taskId);

    public void switchTaskActivity(String taskId, boolean status);

    public Task getTaskById(String taskId);

    public void updateTask(String id, String name);

}
