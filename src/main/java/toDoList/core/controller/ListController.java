package toDoList.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import toDoList.core.service.ListService;
import toDoList.core.service.TaskService;
import toDoList.core.tasks.TasksSwitcher;

@Controller
public class ListController {

    @Autowired
    ListService listsService;
    @Autowired
    TaskService taskService;


    @RequestMapping("/{listId}")
    String homePage(ModelMap modelMap,
                    @PathVariable String listId){
        System.out.println();
        TasksSwitcher switcher = taskService.getAllTasks(listId);

        modelMap.addAttribute("listId", listId);
        modelMap.addAttribute("taskActiveList", switcher.getActiveTasks());
        modelMap.addAttribute("taskDoneList", switcher.getDoneTasks());
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "home";
    }

    @RequestMapping(value = "/addTasklist", method = RequestMethod.GET)
    String viewTaskList(ModelMap modelMap){
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "/addTasklist";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    String createNewTaskList(@RequestParam("title")String name, ModelMap modelMap){
        listsService.createList(name);
        modelMap.addAttribute("taskLists", listsService.getAll());
        return "addTasklist";
    }

    @RequestMapping(value = "", method = RequestMethod.PATCH)
    void updateList(@RequestParam("listId")String listId,
                    @RequestParam("title")String listName){
        listsService.update(listId, listName);
    }
}











