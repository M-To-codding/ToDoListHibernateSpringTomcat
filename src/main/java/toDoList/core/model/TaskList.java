package toDoList.core.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "task_list", catalog = "project")

public class TaskList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int listId;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tasksList")
    private List<Task> allTasks;

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
    }

    public String getName() {
        return name;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }
}