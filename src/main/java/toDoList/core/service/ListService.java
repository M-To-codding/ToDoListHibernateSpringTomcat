package toDoList.core.service;


import toDoList.core.model.Task;
import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by employee on 11/23/16.
 */
public interface ListService {
    public List<TaskList> getAll();

    TaskList getById(String id);

    void createList(TaskList taskList);

    void update(TaskList taskList);

    void deleteTaskList(String id);
}
