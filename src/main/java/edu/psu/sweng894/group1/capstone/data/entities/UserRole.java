package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Defines the {@link Role} a user has.
 */
public class UserRole {

    private Integer id;

    private Integer role;

    private Integer user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}
