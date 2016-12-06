package toDoList.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    String createTask(ModelMap modelMap) {
        List<TaskList> taskLists = listService.getAll();
        modelMap.addAttribute("lists", taskLists);
        return "addTask";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    @ResponseBody
    String createTask(@RequestParam("name") String name,
                      @RequestParam("listId") String listId) {
        taskService.addNewTask(name, listId);
        return "redirect:/home";
    }

    @RequestMapping(value = "/addTask/switch", method = RequestMethod.PUT)
    @ResponseBody
    String switchTask(@RequestParam("id") String id,
                      @RequestParam("isActive") Boolean status) {
        taskService.switchTaskActivity(id, status);
        return "redirect:/home";
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.PATCH)
    @ResponseBody
    void updateTask(@RequestParam("id")String id,
                    @RequestParam("name")String name){
        taskService.updateTask(id, name);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @ResponseBody
    String deleteTask(@RequestParam("id") String id) {
        taskService.delete(id);
        return "redirect:/home";
    }
}
