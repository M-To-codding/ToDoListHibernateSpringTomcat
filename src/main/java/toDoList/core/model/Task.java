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
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_active")
    private Boolean isActive = false;

    @Column(name = "id_list")
    private String listId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_list", insertable = false, updatable = false )
    private TaskList tasksList;

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
        isActive = true;
    }

    public Task(String  id, String name, boolean isActive, String  listId) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.listId = listId;
    }

    public Task(String name, boolean isActive, String  listId) {
        this.name = name;
        this.isActive = isActive;
        this.listId = listId;
    }

    public Task() {
    }

    public Task(String name, String listId, boolean isActive) {
        this.name = name;
        this.listId = listId;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }
}

