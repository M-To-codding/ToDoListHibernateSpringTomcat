package toDoList.core.model;

import javax.persistence.*;
//import org.hibernate.annotations.Entity;
import java.util.List;

@Entity
@Table(name = "taskList", catalog = "project")

public class TaskList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String listId;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tasksList")
    private List<Task> allTasks;

    public TaskList(String listId, String name) {
        this.listId = listId;
        this.name = name;
    }

    public TaskList(String name) {
        this.name = name;
    }

    public TaskList(){}

    public void setId(String listId) {
        this.listId = listId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

    public String getId() {
        return listId;
    }

    public String getName() {
        return name;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }
}