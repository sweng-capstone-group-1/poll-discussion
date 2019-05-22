package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test the User Service.
 */
public class UserServiceTest {

    private UserService userService;

    @Before
    public void before() {

        // user repository stub
        UserRepository repo = new UserRepository() {

        };
        userService = new UserService(repo);

    }

    @Test
    public void testInsert() {
        User insertUser = new User();
        User insertedUser = this.userService.createUser(insertUser);
        Assert.assertNotNull("Inserted User is null", insertedUser);
        Assert.assertNotNull("id of inserted user is null", insertedUser.getId());
    }

    @Test
    public void testUpdate() {

        User start = new User();
        User insertedUser = this.userService.createUser(start);
/*
        String firstName = "Bob";
        insertedUser.setFirstName(firstName);
        User finalUser = this.userService.updateUser(insertedUser);

        Assert.assertNotNull("user is null", finalUser);
        Assert.assertEquals(firstName, finalUser.getFirstName());
        */

    }

}