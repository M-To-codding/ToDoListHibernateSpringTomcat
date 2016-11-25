package toDoList.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import toDoList.core.model.TaskList;


import java.util.List;

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


}