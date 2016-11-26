package core;


import org.hibernate.annotations.Entity;

import javax.persistence.*;


@Entity
@Table(name = "task", catalog = "project")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Basic
    @Column
    private String name;

    @Basic
    @Column
    private Boolean isActive;

    @Basic
    @Column
    @OneToMany
    private List<TaskList> listId;

    public Task(){}

    public Task(String name, Long id) {
        this.name = name;
        this.id = id;
        isActive = true;
    }

    public Task(Long id, String name, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setListId(List<TaskList> listId) {
        this.listId = listId;
    }

    public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public List<TaskList> getListId() {
        return listId;
    }
}
