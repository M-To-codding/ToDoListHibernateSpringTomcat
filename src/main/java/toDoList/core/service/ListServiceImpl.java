package toDoList.core.service;

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

    public List<TaskList> getAll() {
        System.out.println("service");
        return taskListDao.getAll();
    }


}