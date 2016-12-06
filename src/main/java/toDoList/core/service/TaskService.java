package toDoList.core.service;

import toDoList.core.model.Task;
<<<<<<< HEAD
import toDoList.core.tasks.TasksAktivity;
=======
import toDoList.core.tasks.TasksSwitcher;

import java.util.List;
>>>>>>> origin/newBranch

/**
 * Created by employee on 11/25/16.
 */
public interface TaskService {
<<<<<<< HEAD
    public TasksAktivity getAllTasks();

    public TasksAktivity getAllTasks(String listId);

    public void addNewTask(String name, String listId);

    public void delete(String id);

    public void switchTaskActivity(String id, boolean status);

    public Task getTaskById(String id);
=======
    public TasksSwitcher getAllTasks();

    public TasksSwitcher getAllTasks(String listId);

    public void addNewTask(String name, String listId);

    public void deleteTask(String taskId);

    public void switchTaskActivity(String taskId, boolean status);

    public Task getTaskById(String taskId);
>>>>>>> origin/newBranch

    public void updateTask(String id, String name);

}
