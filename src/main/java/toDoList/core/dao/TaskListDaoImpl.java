package toDoList.core.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import toDoList.core.model.Task;
import toDoList.core.model.TaskList;

import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;


/**
 * Created by employee on 11/24/16.
 */
@Repository("taskList")
public class TaskListDaoImpl implements TaskListDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<TaskList> getAll() {
        Criteria criteria = sessionFactory.getCurrentSession()
                .createCriteria(TaskList.class);
        List<TaskList> taskLists = (List<TaskList>) criteria.list();
        return taskLists;
    }

    @Override
    public TaskList getById(String id) {
        return (TaskList) sessionFactory.getCurrentSession().get(TaskList.class, id);
    }

    public void create(String name) {
        sessionFactory.getCurrentSession().save(new TaskList(name));
    }


    public void update(String listId, String listName) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(TaskList.class)
                .add(eq("id", listId));
        TaskList taskList = (TaskList) criteria.uniqueResult();
        taskList.setName(listName);
        session.update(taskList);
    }

    public void delete(String id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(TaskList.class)
                .add(eq("id", id));
        TaskList taskLists = (TaskList) criteria.uniqueResult();
        for (Task task : taskLists.getAllTasks()) {
            session.delete(task);
        }
        session.delete(taskLists);
    }
}