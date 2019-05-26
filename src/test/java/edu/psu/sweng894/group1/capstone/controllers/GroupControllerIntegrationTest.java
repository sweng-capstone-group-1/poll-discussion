package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.CapstoneProperties;
import edu.psu.sweng894.group1.capstone.data.entities.Group;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.services.GroupService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@IfProfileValue(name = "test-group", value = "integration") // only run if property set, so we do not run when building
@TestPropertySource("classpath:application-test.properties")
public class GroupControllerIntegrationTest {

    @Autowired
    private CapstoneProperties capstoneProperties;

        @Before
        public void setUp() {

        }

        @Test
        public void testAddMembers() {
            GroupController testGroupController = new GroupController();
            User testUser = new User();
            Group testGroup = new Group("Test Group");
            testGroupController.addMembers(testGroup, testUser);
            Set<User> memberSet = new HashSet<User>();
            Assert.assertTrue(testGroup.getMembers().contains(testUser));
        }

}
