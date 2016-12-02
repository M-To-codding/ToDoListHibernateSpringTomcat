package toDoList.core.service;

import toDoList.core.model.Task;
import toDoList.core.tasks.TasksAktivity;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
    public TasksAktivity getAllTasks();

    public TasksAktivity getAllTasks(String listId);

    public void addNewTask(String name, String listId);

    public void delete(String id);

    public void switchTaskActivity(String id, boolean status);

    public Task getTaskById(String id);

    public void updateTask(String id, String name);

}
