package toDoList.core.dao;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskDao {
    List<Task> getAll();

    public void create(String name, String listId);

    void update(String id, String name);

<<<<<<< HEAD
    void switchTaskStatus(String  id, boolean isActive);

    Task getTaskById(String id);

    List<Task> getTasksFromList(String  listId);


    void delete(String id);
=======
    void switchTaskStatus(String  taskId, boolean isActive);

    Task getTaskById(String taskId);

    List<Task> getTasksFromList(String  idlist);


    void delete(String taskId);
>>>>>>> origin/newBranch

}
