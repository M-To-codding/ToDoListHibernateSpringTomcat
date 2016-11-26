package toDoList.core.dao;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import toDoList.core.model.Task;

import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;

/**
 * Created by employee on 11/25/16.
 */
public class TaskDaoImpl implements TaskDao{
    @Autowired
    private SessionFactory sessionFactory;

    public void createTask(Task task) {
        sessionFactory.getCurrentSession().save(task);
    }

    public List<Task> getAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Task.class);
        return  (List<Task>) criteria.list();
    }

    public void deleteTask(Integer id) {
        Task task = (Task) sessionFactory.getCurrentSession().createCriteria(Task.class)
                .add(eq("id", id)).uniqueResult();
        sessionFactory.getCurrentSession().delete(task);
    }
}



