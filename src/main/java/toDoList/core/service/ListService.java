package toDoList.core.service;


import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by employee on 11/23/16.
 */
public interface ListService {
    public List<TaskList> getAll();

    public TaskList getById(String id);

    public void createList(String name);

    public void update(String listId, String listName);

    public void deleteTaskList(String listId);
}