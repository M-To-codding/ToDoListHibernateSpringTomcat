package toDoList.core.tasks;

import toDoList.core.model.Task;

import java.util.List;

/**
 * Created by Я on 29.11.2016.
 */
public class TasksSwitcher {
    private List<Task> activeTasks;
    private List<Task> doneTasks;

    public List<Task> getActiveTasks() {
        return activeTasks;
    }

    public void setActiveTasks(List<Task> activeTasks) {
        this.activeTasks = activeTasks;
    }

    public List<Task> getDoneTasks() {
        return doneTasks;
    }

    public void setDoneTasks(List<Task> doneTasks) {
        this.doneTasks = doneTasks;
    }
}
