package toDoList.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import toDoList.core.model.TaskList;
import toDoList.core.service.ListService;


import java.util.List;

@Controller
public class ListController {

    @Autowired
    ListService listsService;

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