package toDoList.core.service;


import toDoList.core.model.Task;
import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by employee on 11/23/16.
 */
public interface ListService {

    public List<TaskList> getAll();

    public void createTaskList(String name);

    public void deleteList(String listId);

    public void updateTaskList(String listId, String name);
}
