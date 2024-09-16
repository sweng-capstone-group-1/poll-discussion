package edu.psu.sweng894.group1.capstone.data.entities;

import java.util.Set;
/**
 * Defines the users of the application.
 */
public class Group {

    private Integer id;

    private String groupName;

    private Set<User> members;

    public Group(String name) {
        this.groupName = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setMembers(Set<User> members) { this.members = members; }

    public Set<User> getMembers() { return members; }
}
