package ua.goit.java.model;

public class Task {
    private int id;
    private String name;
    private String category;
    private String complete;

    public Task(int id, String name, String category, String complete) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.complete = complete;
    }

    public Task(String name, String category, String complete) {
        this.name = name;
        this.category = category;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", complete='" + complete + '\'' +
                '}';
    }
}
