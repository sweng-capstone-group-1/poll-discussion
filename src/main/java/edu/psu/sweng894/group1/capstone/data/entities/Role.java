package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Defines the roles in the application.
 */
public class Role {

    private Integer id;

    private String name;

    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
