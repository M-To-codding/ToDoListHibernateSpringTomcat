package core.dao;

import core.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Я on 24.11.2016.
 */

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class TaskDaoImpl implements TaskDao {

    @Autowired
    SessionFactory sessionFactory;

    public List<Task> getTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Task").list();
    }

    public void addTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.save(task);
    }

    public Task getTask(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Task) session.get(Task.class, id);
    }

    public void updateTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.update(task);
    }

    public void deleteTask(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Task task = getTask(id);
        session.delete(task);
    }
}
