package toDoList.core.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toDoList.core.dao.TaskListDaoImpl;
import toDoList.core.model.TaskList;

import java.util.List;


@Service
@Transactional
public class ListServiceImpl implements ListService {

    @Autowired(required = true)
    TaskListDaoImpl taskListDao;

    SessionFactory sessionFactory;

    public List<TaskList> getAll() {
        return taskListDao.getAll();
    }

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
