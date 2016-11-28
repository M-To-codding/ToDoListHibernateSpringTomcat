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

    public Task() {
    }

    public Task(String name) {
        this.name = name;
        this.listId = listId;
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

