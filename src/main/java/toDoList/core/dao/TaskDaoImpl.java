package toDoList.core.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import toDoList.core.model.Task;

import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;

/**
 * Created by employee on 11/25/16.
 */
@Repository("task")
public class TaskDaoImpl implements TaskDao{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Task> getAll(){
        Criteria criteria = sessionFactory.getCurrentSession()
                .createCriteria(Task.class);
        List<Task> list = (List<Task>) criteria.list();
        return list;
    }

    public List<Task> getTasksFromList(String listId) {
<<<<<<< HEAD
        Criteria criteria = sessionFactory.getCurrentSession()
                .createCriteria(Task.class)
                .add(eq("listId", Integer.parseInt(listId)));
=======
        if (listId.equals("0"))
            return getAll();
        Criteria criteria = sessionFactory.getCurrentSession()
                .createCriteria(Task.class)
                .add(eq("listId", listId));
>>>>>>> origin/newBranch
        List<Task> taskList = (List<Task>) criteria.list();
        return taskList;
    }

    public void create(String name, String listId) {
<<<<<<< HEAD
        Task task = new Task(name, Integer.parseInt(listId), true);
        sessionFactory.getCurrentSession().save(task);
    }

    public void delete(String id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Task task = (Task) currentSession.createCriteria(Task.class)
                .add(eq("id", Integer.parseInt(id))).uniqueResult();
        currentSession.delete(task);
    }

    public void switchTaskStatus(String id, boolean isActive) {
        Session currentSession = sessionFactory.getCurrentSession();
        Task task = (Task) currentSession.createCriteria(Task.class)
                .add(eq("id", Integer.parseInt(id))).uniqueResult();
=======
        Task task = new Task(name, listId, true);
        sessionFactory.getCurrentSession().save(task);
    }

    public void delete(String taskId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Task task = (Task) currentSession.createCriteria(Task.class)
                .add(eq("id", taskId)).uniqueResult();
        currentSession.delete(task);
    }

    public void switchTaskStatus(String taskId, boolean isActive) {
        Session currentSession = sessionFactory.getCurrentSession();
        Task task = (Task) currentSession.createCriteria(Task.class)
                .add(eq("id", taskId)).uniqueResult();
>>>>>>> origin/newBranch
        task.setIsActive(isActive);
        currentSession.update(task);
    }

<<<<<<< HEAD
    public Task getTaskById(String id) {
        Task task = (Task) sessionFactory.getCurrentSession()
                .createCriteria(Task.class)
                .add(eq("id", Integer.parseInt(id)))
=======
    public Task getTaskById(String taskId) {
        Task task = (Task) sessionFactory.getCurrentSession()
                .createCriteria(Task.class)
                .add(eq("id", taskId))
>>>>>>> origin/newBranch
                .uniqueResult();
        return task;
    }

    public void update(String id, String name) {
        Session session = sessionFactory.getCurrentSession();
<<<<<<< HEAD
        Task task = (Task) session.createCriteria(Task.class).add(eq("id", Integer.parseInt(id))).uniqueResult();
=======
        Task task = (Task) session.createCriteria(Task.class).add(eq("id", id)).uniqueResult();
>>>>>>> origin/newBranch
        task.setName(name);
        session.save(task);
    }
}



