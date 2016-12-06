package toDoList.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskDaoImpl;
import toDoList.core.model.Task;
import toDoList.core.tasks.TasksAktivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired(required = true)
    private TaskDaoImpl taskDao;

    public TasksAktivity getAllTasks() {
        TasksAktivity activities = new TasksAktivity();
        List<Task> activeTasks = new ArrayList();
        List<Task> doneTasks = new ArrayList();

        List<Task> tasks = taskDao.getAll();
        for (Task task : tasks) {
            if (task.isActive()) {
                activeTasks.add(task);
            } else {
                doneTasks.add(task);
            }
        }
        activities.setActiveTasks(activeTasks);
        activities.setDoneTasks(doneTasks);

        return activities;
    }

    public TasksAktivity getAllTasks(String listId) {
        TasksAktivity tasksAktivity = new TasksAktivity();

        List<Task> activeTasks = new ArrayList();
        List<Task> doneTasks = new ArrayList();

        List<Task> tasks = taskDao.getTasksFromList(listId);
        for (Task task : tasks) {
            if (task.isActive()) {
                activeTasks.add(task);
            } else {
                doneTasks.add(task);
            }
        }
        tasksAktivity.setActiveTasks(activeTasks);
        tasksAktivity.setDoneTasks(doneTasks);

        return tasksAktivity;
    }

    public void addNewTask(String name, String listId){
        taskDao.create(name, listId );
    }

    public void delete(String id) {
        taskDao.delete(id);
    }

    public void switchTaskActivity(String id, boolean status) {
        taskDao.switchTaskStatus(id, !status);
    }

    public Task getTaskById(String id) {
        return taskDao.getTaskById(id);
    }

    public void updateTask(String id, String name) {
        taskDao.update(id, name);
    }
}

