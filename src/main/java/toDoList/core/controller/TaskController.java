package toDoList.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMethod;
=======
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
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
<<<<<<< HEAD
public class TaskController {
=======
public class TaskController{
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

    @Autowired
    private TaskService taskService;
    @Autowired
    private ListService listService;

    @RequestMapping(value = "/addTask")
<<<<<<< HEAD
    public String addTask(){

        return "/addTask";
    }

    @RequestMapping(value = "/addNewTask")
    public String add(@RequestParam("taskName") String taskName,
                      @RequestParam("listId") String taskListId) {
=======
    public String addPage(ModelMap modelMap){
        List<TaskList> taskLists = listService.getAll();
        modelMap.addAttribute("taskLists", taskLists);
        return "addTask";
    }


    @RequestMapping(value = "/add_new_task")
    public String add(@RequestParam("name") String taskName,
                      @RequestParam("id_list") String taskListId){
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

        Task task = new Task();
        task.setName(taskName);
        task.setIsActive(false);
<<<<<<< HEAD
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
=======
        task.setListId(Integer.valueOf(taskListId));

        taskService.createTask(task);

        return "redirect:/home";

    }

    @RequestMapping(value = "/taskDelete")
    public String delete(@RequestParam("id") Integer taskId){

        taskService.deleteTask(taskId);
        return "redirect:/home";
    }


>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
}
