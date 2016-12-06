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
<<<<<<< HEAD
=======
import toDoList.core.tasks.TasksSwitcher;
>>>>>>> origin/newBranch

import java.util.List;

/**
 * Created by employee on 11/25/16.
 */
@Controller
<<<<<<< HEAD
=======
@RequestMapping("/")
>>>>>>> origin/newBranch
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private ListService listService;

<<<<<<< HEAD
    @RequestMapping(value = "/addTask")
=======
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
>>>>>>> origin/newBranch
    String createTask(ModelMap modelMap) {
        List<TaskList> taskLists = listService.getAll();
        modelMap.addAttribute("lists", taskLists);
        return "addTask";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
<<<<<<< HEAD
    String createTask(@RequestParam("name") String name,
=======
    String createTask(@RequestParam("title") String name,
>>>>>>> origin/newBranch
                      @RequestParam("listId") String listId) {
        taskService.addNewTask(name, listId);
        return "redirect:/home";
    }

<<<<<<< HEAD
    @RequestMapping(value = "/addTask/switch", method = RequestMethod.PUT)
    String switchTask(@RequestParam("id") String id,
                      @RequestParam("isActive") Boolean status) {
        taskService.switchTaskActivity(id, status);
        return "redirect:/home";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.PATCH)
    void updateTask(@RequestParam("id")String id,
                    @RequestParam("name")String name){
        taskService.updateTask(id, name);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    String deleteTask(@RequestParam("id") String id) {
        taskService.delete(id);
        return "redirect:/home";
=======
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
>>>>>>> origin/newBranch
    }
}
