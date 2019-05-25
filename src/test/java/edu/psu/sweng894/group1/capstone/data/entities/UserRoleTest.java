package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleTest {

    @Test
    public void setId() {
        UserRole testUserRole = new UserRole(1,1);
        Assert.assertNull(testUserRole.getId());
        testUserRole.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testUserRole.getId());
    }

    @Test
    public void setRoleId() {
        UserRole testUserRole = new UserRole(1,1);
        Assert.assertEquals(Integer.valueOf(1), testUserRole.getRoleId());
        testUserRole.setRoleId(2);
        Assert.assertEquals(Integer.valueOf(2), testUserRole.getRoleId());
    }

    @Test
    public void setUserId() {
        UserRole testUserRole = new UserRole(1,1);
        Assert.assertEquals(Integer.valueOf(1), testUserRole.getUserId());
        testUserRole.setUserId(2);
        Assert.assertEquals(Integer.valueOf(2), testUserRole.getUserId());
    }
}