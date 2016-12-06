package toDoList.core.model;

import javax.persistence.*;

@Entity
@Table (name = "task", catalog = "project", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_active")
    private Boolean isActive = false;

    @Column(name = "id_list")
    private int listId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_list", insertable = false, updatable = false )
    private TaskList tasksList;

    public Task() {
    }

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        isActive = true;
    }

    public Task(String name, boolean isActive, int  listId) {
        this.name = name;
        this.isActive = isActive;
        this.listId = listId;
    }

    public Task(String name, int listId, boolean isActive) {
        this.name = name;
        this.listId = listId;
        this.isActive = isActive;
    }

    public Task(int  id, String name, boolean isActive, int listId) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.listId = listId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }
}

