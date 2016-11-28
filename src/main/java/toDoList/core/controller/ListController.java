package toDoList.core.controller;


<<<<<<< HEAD
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import toDoList.core.model.Task;
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;
import toDoList.core.service.TaskService;

import java.util.List;

import static org.hibernate.criterion.Restrictions.eq;
=======
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;


import java.util.List;
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

@Controller
public class ListController {

    @Autowired
    ListService listsService;
<<<<<<< HEAD
    @Autowired
    TaskService taskService;

    @RequestMapping(value = "/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelMap getAllTaskLists() {
        List<TaskList> taskList = listsService.getAll();
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("taskLists", taskList);
        return modelMap;
    }

    @RequestMapping(value = "/addTasklist")
    public String addListPage() {
        return "addTasklist";
    }

    @RequestMapping(value = "/addTasklist", method = RequestMethod.POST)
    public String add(@RequestParam("name") String taskListName) {
        TaskList taskList = new TaskList();
        taskList.setName(taskListName);
        listsService.createList(taskList);
        return "redirect:/home";
    }

    @RequestMapping(value = "/tasklistPage")
    public String tasklistPage(@RequestParam("taskListId") String idList, ModelMap modelMap) {
        TaskList taskList = listsService.getById(idList);
        List<Task> isDone = taskService.getDone(idList);
        List<Task> isActive = taskService.getActive(idList);

        modelMap.addAttribute("taskList", taskList);
        modelMap.addAttribute("isDone", isDone);
        modelMap.addAttribute("isActive", isActive);

        return "tasklistPage";
    }

    @RequestMapping(value = "/newTasklist")
    public String addPage() {
        return "newTasklist";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestParam("listId") String listId) {
        listsService.deleteTaskList(listId);
        return "redirect:/home";
    }
}

=======

    @RequestMapping (value ="/")
    public ModelAndView index(){

        System.out.println("index()");
        return new ModelAndView("redirect:/home");
    }

    @RequestMapping (value ="/home", method = RequestMethod.GET)
    public ModelMap getAll(){

        List<TaskList> taskLists = listsService.getAll();
        System.out.println("controller");
        return new ModelMap("taskLists", taskLists);
    }

}
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
