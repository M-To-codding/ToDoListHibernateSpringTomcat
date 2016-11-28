package toDoList.core.service;

<<<<<<< HEAD
import org.hibernate.SessionFactory;
=======
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toDoList.core.dao.TaskListDaoImpl;
<<<<<<< HEAD
import toDoList.core.model.Task;
=======
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
import toDoList.core.model.TaskList;

import java.util.List;

<<<<<<< HEAD
import static org.hibernate.criterion.Restrictions.eq;

=======
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

@Service
@Transactional
public class ListServiceImpl implements ListService {

    @Autowired(required = true)
    TaskListDaoImpl taskListDao;

<<<<<<< HEAD
    SessionFactory sessionFactory;

    public List<TaskList> getAll() {
        return taskListDao.getAll();
    }

    @Override
    public TaskList getById(String id) {
        return taskListDao.getById(id);
    }

    public void createList(TaskList taskList) {
        taskListDao.create(taskList);
    }

    public void update(TaskList taskList) {
        taskListDao.update(taskList);
    }

    public void deleteTaskList(String listId) {
        taskListDao.delete(listId);
    }
=======
    public List<TaskList> getAll() {
        System.out.println("service");
        return taskListDao.getAll();
    }


>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
}