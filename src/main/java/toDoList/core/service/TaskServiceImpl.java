package toDoList.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskDaoImpl;
import toDoList.core.model.Task;
import toDoList.core.tasks.TasksSwitcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by employee on 11/25/16.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired(required = true)
    private TaskDaoImpl taskDao;

    public TasksSwitcher getAllTasks() {
        TasksSwitcher activities = new TasksSwitcher();
        List<Task> taskActiveList = new ArrayList();
        List<Task> taskDoneList = new ArrayList();

        List<Task> tasks = taskDao.getAll();
        for (Task task : tasks) {
            if (task.isActive()) {
                taskActiveList.add(task);
            } else {
                taskDoneList.add(task);
            }
        }
        activities.setActiveTasks(taskActiveList);
        activities.setDoneTasks(taskDoneList);

        return activities;
    }

    public TasksSwitcher getAllTasks(String listId) {
        TasksSwitcher tasksSwitcher = new TasksSwitcher();

        List<Task> taskActiveList = new ArrayList();
        List<Task> taskDoneList = new ArrayList();

        List<Task> tasks = taskDao.getTasksFromList(listId);
        for (Task task : tasks) {
            if (task.isActive()) {
                taskActiveList.add(task);
            } else {
                taskDoneList.add(task);
            }
        }
        tasksSwitcher.setActiveTasks(taskActiveList);
        tasksSwitcher.setDoneTasks(taskDoneList);

        return tasksSwitcher;
    }

    public void addNewTask(String name, String listId){
        taskDao.create(name, listId );
    }

    public void deleteTask(String taskId) {
        taskDao.delete(taskId);
    }

    public void switchTaskActivity(String taskId, boolean status) {
        taskDao.switchTaskStatus(taskId, !status);
    }

    public Task getTaskById(String taskId) {
        return taskDao.getTaskById(taskId);
    }

    public void updateTask(String id, String name) {
        taskDao.update(id, name);
    }
}

