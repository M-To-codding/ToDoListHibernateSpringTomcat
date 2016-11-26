package core.service;

import core.Task;
import core.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Я on 24.11.2016.
 */
@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskDao taskDao;

    public List<Task> getTasks() {
        return taskDao.getTasks();
    }

    public void addTask(Task task) {
        taskDao.addTask(task);
    }

    public Task getTask(Long id) {
        return taskDao.getTask(id);
    }

    public void updateTask(Task task) {
        taskDao.updateTask(task);
    }

    public void deleteTask(Long id) {
        taskDao.deleteTask(id);
    }
}
