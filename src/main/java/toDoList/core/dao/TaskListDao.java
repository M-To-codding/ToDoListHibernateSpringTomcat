package toDoList.core.dao;

import toDoList.core.model.TaskList;

import java.util.List;

/**
 * Created by Я on 25.11.2016.
 */
public interface TaskListDao {
    public List<TaskList> getAll();

    public void create(String title);

    public void delete(String listId);

    public void update(String listId, String name);
}