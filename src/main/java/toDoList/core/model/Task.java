package toDoList.core.model;

import javax.persistence.*;

<<<<<<< HEAD
=======
import static javax.persistence.GenerationType.IDENTITY;

>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
@Entity
@Table (name = "task", catalog = "project", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class Task {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taskId")
    private Integer id;

    @Column(name = "taskName")
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
    private String name;

    @Column(name = "is_active")
    private Boolean isActive = false;

    @Column(name = "id_list")
<<<<<<< HEAD
    private String listId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_list", insertable = false, updatable = false )
    private TaskList tasksList;
=======
    private Integer listId;
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016

    public Task() {
    }

<<<<<<< HEAD
    public Task(String name) {
=======
    public Task(String name, Integer listId) {
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
        this.name = name;
        this.listId = listId;
    }

<<<<<<< HEAD
    public String getId() {
        return id;
    }

    public void setId(String id) {
=======
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

<<<<<<< HEAD
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
=======
    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
>>>>>>> e09f6f9e886a956cd1891eeeeddf593e3c62f016
        this.listId = listId;
    }
}

