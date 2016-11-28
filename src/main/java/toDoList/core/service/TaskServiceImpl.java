package toDoList.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskDaoImpl;
import toDoList.core.model.Task;

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

    public void createTask(Task task) {
        taskDao.createTask(task);
    }

    public List<Task> getAll() {
        return taskDao.getAll();
    }

    public List<Task> getActive(String listId) {
        List<Task> active = getTasksActivity(listId, false);
        return active;
    }

    public List<Task> getDone(String listId) {
        List<Task> done = getTasksActivity(listId, true);
        return done;
    }

    public void updateActivity(String taskId) {
        Task task = getTasksFromList(taskId);
        task.setIsActive(!task.getIsActive());
        taskDao.update(task);
    }

    public List<Task> getTasksActivity(String idList, boolean isActive) {
        List<Task>taskList = new ArrayList<>();
        for (Task tasks:taskList){
            if (tasks.getListId().equals(idList) && tasks.getIsActive().equals(isActive)){
                taskList.add(tasks);
            }
        }
        return taskList;
    }

    public Task getTasksFromList(String id){
        Integer neededTaskId = Integer.valueOf(id);

        Task task = getAll()
                .stream()
                .filter(neededTaskList -> neededTaskList.getId().equals(neededTaskId))
                .findFirst()
                .get();

        return task;
    }

    public void update(Task task) {
        taskDao.update(task);
    }

    public void deleteTask(String taskId) {
        taskDao.deleteTask(taskId);

    }
}

