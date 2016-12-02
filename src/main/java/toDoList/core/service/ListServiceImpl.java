package toDoList.core.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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