package toDoList.core.model;

import javax.persistence.*;
<<<<<<< HEAD
//import org.hibernate.annotations.Entity;
import java.util.List;

@Entity
@Table(name = "tasklist", catalog = "project")
=======

import java.util.List;

@Entity
@Table(name = "tasklist")
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

public class TaskList {
    @Id
    @Column(name = "id")
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  id;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

    @Column(name = "name")
    private String name;

<<<<<<< HEAD
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tasksList")
    private List<Task> allTasks;

    public String  getId() {
        return id;
    }

    public void setId(String id) {
=======
    @OneToMany(fetch = FetchType.LAZY)
    private List<Task> allTasks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }
}