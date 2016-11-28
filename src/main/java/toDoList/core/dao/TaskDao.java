package toDoList.core.dao;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
public interface TaskDao {
    List<Task> getAll();

    void createTask(Task task);

<<<<<<< HEAD
    void update(Task task);

    List<Task> getTasksFromList(String  idlist);

    void deleteTask(String  id);
=======
    void deleteTask(Integer id);
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

}
