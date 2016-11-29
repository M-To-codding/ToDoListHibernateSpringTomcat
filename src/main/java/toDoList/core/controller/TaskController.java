package toDoList.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;
import toDoList.core.service.TaskService;
import toDoList.core.tasks.TasksSwitcher;

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private ListService listService;

    @RequestMapping(value = "/home")
    public String home() {
        return "/home";
    }

    @RequestMapping("")
    String homePageTasks(ModelMap modelMap){
        TasksSwitcher switcher = taskService.getAllTasks();

        modelMap.addAttribute("taskActiveList", switcher.getActiveTasks());
        modelMap.addAttribute("taskDoneList", switcher.getDoneTasks());
        modelMap.addAttribute("taskLists", listService.getAll());
        return "home";
    }


    @RequestMapping("/addTask")
    String createTask(ModelMap modelMap) {
        List<TaskList> taskLists = listService.getAll();
        modelMap.addAttribute("lists", taskLists);
        return "addTask";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    String createTask(@RequestParam("title") String name,
                      @RequestParam("listId") String listId) {
        taskService.addNewTask(name, listId);
        return "redirect:/home";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.DELETE)
    String deleteTask(@RequestParam("taskId") String taskId) {
        taskService.deleteTask(taskId);
        return "redirect:/home";
    }

    @RequestMapping(value = "/switch", method = RequestMethod.PUT)
    String switchTask(@RequestParam("taskId") String taskId,
                      @RequestParam("active") Boolean status) {
        taskService.switchTaskActivity(taskId, status);
        return "redirect:/home";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.PATCH)
    void updateTask(@RequestParam("id")String id,
                    @RequestParam("title")String title){
        taskService.updateTask(id, title);
    }
}
