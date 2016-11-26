package toDoList.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class TaskController{

    @Autowired
    private TaskService taskService;
    @Autowired
    private ListService listService;

    @RequestMapping(value = "/addTask")
    public String addPage(ModelMap modelMap){
        List<TaskList> taskLists = listService.getAll();
        modelMap.addAttribute("taskLists", taskLists);
        return "addTask";
    }


    @RequestMapping(value = "/add_new_task")
    public String add(@RequestParam("name") String taskName,
                      @RequestParam("id_list") String taskListId){

        Task task = new Task();
        task.setName(taskName);
        task.setIsActive(false);
        task.setListId(Integer.valueOf(taskListId));

        taskService.createTask(task);

        return "redirect:/home";

    }

    @RequestMapping(value = "/taskDelete")
    public String delete(@RequestParam("id") Integer taskId){

        taskService.deleteTask(taskId);
        return "redirect:/home";
    }


}
