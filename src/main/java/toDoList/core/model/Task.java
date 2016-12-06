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
<<<<<<< HEAD
    private int id;
=======
    private String id;
>>>>>>> origin/newBranch

    @Column(name = "name")
    private String name;

    @Column(name = "is_active")
    private Boolean isActive = false;

    @Column(name = "id_list")
<<<<<<< HEAD
    private int listId;
=======
    private String listId;
>>>>>>> origin/newBranch

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_list", insertable = false, updatable = false )
    private TaskList tasksList;

<<<<<<< HEAD
    public Task() {
    }

    public Task(int id, String name) {
=======
    public Task(String id, String name) {
>>>>>>> origin/newBranch
        this.id = id;
        this.name = name;
        isActive = true;
    }

<<<<<<< HEAD
    public Task(String name, boolean isActive, int  listId) {
=======
    public Task(String  id, String name, boolean isActive, String  listId) {
        this.id = id;
>>>>>>> origin/newBranch
        this.name = name;
        this.isActive = isActive;
        this.listId = listId;
    }

<<<<<<< HEAD
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

=======
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

>>>>>>> origin/newBranch
    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

<<<<<<< HEAD
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

=======
>>>>>>> origin/newBranch
    public Boolean getIsActive() {
        return isActive;
    }

<<<<<<< HEAD
    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
=======
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
>>>>>>> origin/newBranch
        this.listId = listId;
    }
}

