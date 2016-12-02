package toDoList.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import toDoList.core.dao.TaskListDao;
import toDoList.core.model.Task;
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;
import toDoList.core.service.TaskService;
import toDoList.core.tasks.TasksAktivity;

@Controller
public class ListController {

    @Autowired
    ListService listsService;
    @Autowired
    TaskService taskService;

    @RequestMapping(value = "/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    String home(ModelMap modelMap){
        TasksAktivity tasksAktivity = taskService.getAllTasks();
        modelMap.addAttribute("activeTasks", tasksAktivity.getActiveTasks());
        modelMap.addAttribute("doneTasks", tasksAktivity.getDoneTasks());
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "home";
    }

    @RequestMapping("/home/{listId}")
    String homePage(ModelMap modelMap,
                    @PathVariable String listId){
        System.out.println();
        TasksAktivity activities = taskService.getAllTasks(listId);

        modelMap.addAttribute("listId", listId);
        modelMap.addAttribute("activeTasks", activities.getActiveTasks());
        modelMap.addAttribute("doneTasks", activities.getDoneTasks());
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "home";
    }

    @RequestMapping(value = "/addTasklist", method = RequestMethod.GET)
    String taskList(ModelMap modelMap){
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "addTasklist";
    }

    @RequestMapping(value = "/addTasklist", method = RequestMethod.POST)
    String create(@RequestParam("name")String name, ModelMap modelMap){
        listsService.createTaskList(name);
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "addTasklist";
    }

    @RequestMapping(value = "/deleteTasklist", method = RequestMethod.POST)
    String deleteTasklist(@RequestParam("taskListId")String taskListId, ModelMap modelMap) {
        listsService.deleteList(taskListId);
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "addTasklist";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    void update(@RequestParam("listId")String listId,
                    @RequestParam("name")String name){
        listsService.updateTaskList(listId, name);
    }

    @RequestMapping(value = {"/home/{listId}"}, method = RequestMethod.DELETE)
    public String deleteList(@PathVariable String id) {
        listsService.deleteList(id);
        return "redirect:/home";
    }
}

