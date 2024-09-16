package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Group;
import edu.psu.sweng894.group1.capstone.data.repositories.GroupRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupServiceTest {

    private GroupService groupService;

    @Before
    public void before() {
        // stub the repository
        GroupRepository repo = new GroupRepository() {

        };

        groupService = new GroupService(repo);

    }

    @Test
    public void testAddGroup() {
        Group testGroup = new Group("Group 1");
        groupService.addGroup(testGroup);
        Group addedGroup = groupService.getGroup(testGroup.getId());
        Assert.assertEquals(testGroup.getId(), addedGroup.getId());
        Assert.assertEquals(testGroup.getGroupName(), addedGroup.getGroupName());
    }
}
