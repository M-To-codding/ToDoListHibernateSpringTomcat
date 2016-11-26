package core.controller;

import core.Task;
import core.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by employee on 11/22/16.
 */
@RestController
public class TaskController {
    @Autowired
    TaskService taskService;

    @RequestMapping(value = {"/","/tasks"}, method = RequestMethod.GET)
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @RequestMapping(value = {"/task"}, method = RequestMethod.POST)
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @RequestMapping(value = {"/task/{id}"}, method = RequestMethod.GET)
    public void showTask(@PathVariable Long id){
        taskService.getTask(id);
    }

    @RequestMapping(value = {"/task"}, method = RequestMethod.PUT)
    public void updateTask(@RequestBody Task task){
        taskService.updateTask(task);
    }

    @RequestMapping(value = {"/task/{id}"}, method = RequestMethod.DELETE)
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
