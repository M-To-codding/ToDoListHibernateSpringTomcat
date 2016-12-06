package toDoList.core.service;


<<<<<<< HEAD
import toDoList.core.model.Task;
=======
>>>>>>> origin/newBranch
import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by employee on 11/23/16.
 */
public interface ListService {
<<<<<<< HEAD

    public List<TaskList> getAll();

    public void createTaskList(String name);

    public void deleteList(String listId);

    public void updateTaskList(String listId, String name);
}
=======
    public List<TaskList> getAll();

    public TaskList getById(String id);

    public void createList(String name);

    public void update(String listId, String listName);

    public void deleteTaskList(String listId);
}
>>>>>>> origin/newBranch
