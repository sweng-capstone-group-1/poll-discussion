package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleTest {

    @Test
    public void setId() {
        Role role = new Role("admin");
        Assert.assertNull(role.getId());
        role.setId(1);
        Assert.assertEquals(Integer.valueOf(1), role.getId());
    }

    @Test
    public void setName() {
        Role role = new Role("admin");
        Assert.assertEquals("admin", role.getName());
        role.setName("group 1");
        Assert.assertEquals("group 1", role.getName());
    }
}