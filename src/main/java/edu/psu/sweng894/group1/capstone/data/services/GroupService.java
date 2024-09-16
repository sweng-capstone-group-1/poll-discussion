package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Group;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.GroupRepository;

import java.util.Set;

public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void addGroup(Group group) {}

    public Group getGroup(Integer id) {
        return null;
    }

    public Set<User> getMembersOfGroup(Group group) {
        return null;
    }

    public Set<Group> getAdminsOfGroup(Group group) {
        return null;
    }
}

