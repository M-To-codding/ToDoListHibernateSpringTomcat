package toDoList.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskDaoImpl;
import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService{

        @Autowired(required = true)
        private TaskDaoImpl taskDao;


        public void createTask(Task task) {
            taskDao.createTask(task);
        }


        public List<Task> getAll() {

            return taskDao.getAll();
        }


        public void deleteTask(Integer taskId) {
            taskDao.deleteTask(taskId);

        }
    }

