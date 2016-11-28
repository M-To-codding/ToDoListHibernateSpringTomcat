package toDoList.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import toDoList.core.model.Task;
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;
import toDoList.core.service.TaskService;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private ListService listService;

    @RequestMapping(value = "/addTask")
    public String addTask(){

        return "/addTask";
    }

    @RequestMapping(value = "/addNewTask")
    public String add(@RequestParam("taskName") String taskName,
                      @RequestParam("listId") String taskListId) {

        Task task = new Task();
        task.setName(taskName);
        task.setIsActive(false);
        task.setListId(taskListId);

        taskService.createTask(task);
        return "redirect:/home";
    }

    @RequestMapping(value = "/isActive")
    public String changeTaskActivity(@RequestParam("taskId")String id){
        taskService.getActive(id);
        return "redirect:/home";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("id") String taskId) {
        taskService.deleteTask(taskId);
        return "redirect:/home";
    }
}
