package toDoList.core.service;

import org.hibernate.SessionFactory;
<<<<<<< HEAD
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
>>>>>>> origin/newBranch
import toDoList.core.dao.TaskListDaoImpl;
import toDoList.core.model.TaskList;

import java.util.List;


@Service
@Transactional
public class ListServiceImpl implements ListService {

    @Autowired(required = true)
    TaskListDaoImpl taskListDao;

    SessionFactory sessionFactory;

<<<<<<< HEAD

=======
>>>>>>> origin/newBranch
    public List<TaskList> getAll() {
        return taskListDao.getAll();
    }

<<<<<<< HEAD
    public void createTaskList(String name) {
        taskListDao.create(name);
    }

    public void deleteList(String listId) {
        taskListDao.delete(listId);
    }

    public void updateTaskList(String listId, String name) {
        taskListDao.update(listId, name);
    }
}
=======
    @Override
    public TaskList getById(String id) {
        return taskListDao.getById(id);
    }

    public void createList(String name) {
        taskListDao.create(name);
    }

    public void update(String listId, String listName) {
        taskListDao.update(listId, listName);
    }

    public void deleteTaskList(String listId) {
        taskListDao.delete(listId);
    }
}
>>>>>>> origin/newBranch
