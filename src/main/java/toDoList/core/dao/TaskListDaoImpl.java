package toDoList.core.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TaskList.class);
        return (List<TaskList>) criteria.list();
    }

    @Override
    public TaskList getById(String id) {
        return (TaskList) sessionFactory.getCurrentSession().get(TaskList.class, id);
    }

    public void create(TaskList taskList){
        sessionFactory.getCurrentSession().save(taskList);
    }

    public void update(TaskList taskList) {
        Session session = sessionFactory.getCurrentSession();
        session.update(taskList);
    }

    public void delete(String id) {
        Session currentSession = sessionFactory.getCurrentSession();
        TaskList taskList = (TaskList) currentSession.createCriteria(TaskList.class)
                .add(eq("id", id)).uniqueResult();
        currentSession.delete(taskList);
    }
}
