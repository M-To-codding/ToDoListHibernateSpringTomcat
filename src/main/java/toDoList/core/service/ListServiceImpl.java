package toDoList.core.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toDoList.core.dao.TaskListDaoImpl;
import toDoList.core.model.Task;
import toDoList.core.model.TaskList;

import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;


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

    public void createList(TaskList taskList) {
        taskListDao.create(taskList);
    }

    public void update(TaskList taskList) {
        taskListDao.update(taskList);
    }

    public void deleteTaskList(String listId) {
        taskListDao.delete(listId);
    }
}