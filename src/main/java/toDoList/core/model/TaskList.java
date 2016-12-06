package toDoList.core.model;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.List;

@Entity
@Table(name = "task_list", catalog = "project")
=======
//import org.hibernate.annotations.Entity;
import java.util.List;

@Entity
@Table(name = "taskList", catalog = "project")
>>>>>>> origin/newBranch

public class TaskList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private int listId;
=======
    private String  id;
>>>>>>> origin/newBranch

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tasksList")
    private List<Task> allTasks;

<<<<<<< HEAD
    public TaskList(int listId, String name) {
        this.listId = listId;
        this.name = name;
    }

    public TaskList(String name) {
        this.name = name;
    }

    public TaskList(){}

    public void setId(int listId) {
        this.listId = listId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

    public int getId() {
        return listId;
=======
    public TaskList(){ }

    public TaskList(String name){
        this.name = name;
    }

    public TaskList(String id, String listName) {
        this.id = id;
        this.name = listName;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
>>>>>>> origin/newBranch
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public List<Task> getAllTasks() {
        return allTasks;
    }
=======
    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }
>>>>>>> origin/newBranch
}