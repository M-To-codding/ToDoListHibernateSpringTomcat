package toDoList.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskDaoImpl;
import toDoList.core.model.Task;
<<<<<<< HEAD
import toDoList.core.tasks.TasksAktivity;

import java.util.ArrayList;
import java.util.List;
=======
import toDoList.core.tasks.TasksSwitcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
>>>>>>> origin/newBranch

/**
 * Created by employee on 11/25/16.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired(required = true)
    private TaskDaoImpl taskDao;

<<<<<<< HEAD
    public TasksAktivity getAllTasks() {
        TasksAktivity activities = new TasksAktivity();
        List<Task> activeTasks = new ArrayList();
        List<Task> doneTasks = new ArrayList();
=======
    public TasksSwitcher getAllTasks() {
        TasksSwitcher activities = new TasksSwitcher();
        List<Task> taskActiveList = new ArrayList();
        List<Task> taskDoneList = new ArrayList();
>>>>>>> origin/newBranch

        List<Task> tasks = taskDao.getAll();
        for (Task task : tasks) {
            if (task.isActive()) {
<<<<<<< HEAD
                activeTasks.add(task);
            } else {
                doneTasks.add(task);
            }
        }
        activities.setActiveTasks(activeTasks);
        activities.setDoneTasks(doneTasks);
=======
                taskActiveList.add(task);
            } else {
                taskDoneList.add(task);
            }
        }
        activities.setActiveTasks(taskActiveList);
        activities.setDoneTasks(taskDoneList);
>>>>>>> origin/newBranch

        return activities;
    }

<<<<<<< HEAD
    public TasksAktivity getAllTasks(String listId) {
        TasksAktivity tasksAktivity = new TasksAktivity();

        List<Task> activeTasks = new ArrayList();
        List<Task> doneTasks = new ArrayList();
=======
    public TasksSwitcher getAllTasks(String listId) {
        TasksSwitcher tasksSwitcher = new TasksSwitcher();

        List<Task> taskActiveList = new ArrayList();
        List<Task> taskDoneList = new ArrayList();
>>>>>>> origin/newBranch

        List<Task> tasks = taskDao.getTasksFromList(listId);
        for (Task task : tasks) {
            if (task.isActive()) {
<<<<<<< HEAD
                activeTasks.add(task);
            } else {
                doneTasks.add(task);
            }
        }
        tasksAktivity.setActiveTasks(activeTasks);
        tasksAktivity.setDoneTasks(doneTasks);

        return tasksAktivity;
=======
                taskActiveList.add(task);
            } else {
                taskDoneList.add(task);
            }
        }
        tasksSwitcher.setActiveTasks(taskActiveList);
        tasksSwitcher.setDoneTasks(taskDoneList);

        return tasksSwitcher;
>>>>>>> origin/newBranch
    }

    public void addNewTask(String name, String listId){
        taskDao.create(name, listId );
    }

<<<<<<< HEAD
    public void delete(String id) {
        taskDao.delete(id);
    }

    public void switchTaskActivity(String id, boolean status) {
        taskDao.switchTaskStatus(id, !status);
    }

    public Task getTaskById(String id) {
        return taskDao.getTaskById(id);
=======
    public void deleteTask(String taskId) {
        taskDao.delete(taskId);
    }

    public void switchTaskActivity(String taskId, boolean status) {
        taskDao.switchTaskStatus(taskId, !status);
    }

    public Task getTaskById(String taskId) {
        return taskDao.getTaskById(taskId);
>>>>>>> origin/newBranch
    }

    public void updateTask(String id, String name) {
        taskDao.update(id, name);
    }
}

