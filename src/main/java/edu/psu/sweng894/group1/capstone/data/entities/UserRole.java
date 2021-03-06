package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Defines the {@link Role} a user has.
 */
public class UserRole {

    private Integer id;

    private Integer roleId;

    private Integer userId;

    public UserRole() {
    }

    public UserRole(Integer roleId, Integer userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
