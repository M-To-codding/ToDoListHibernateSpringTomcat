package toDoList.core.dao;

import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by Я on 25.11.2016.
 */
public interface TaskListDao {
    List<TaskList> getAll();

    TaskList getById(String id);

    void create(TaskList taskList);

    void update(TaskList taskList);

    void delete(String  id);
}