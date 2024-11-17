package Entities;

public class BaseData {
    private int id;
    private String description;

    //This is a Constructor
    public BaseData(int id, String description) {
        this.id = id;
        this.description = description;
    }

    //This is a Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


