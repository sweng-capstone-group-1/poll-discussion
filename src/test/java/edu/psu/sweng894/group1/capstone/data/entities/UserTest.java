package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void setPassword() {
        User testUser = new User();
        Assert.assertNull(testUser.getPassword());
        testUser.setPassword("abc123");
        Assert.assertEquals("abc123", testUser.getPassword());
    }

    @Test
    public void setEmail() {
        User testUser = new User();
        Assert.assertNull(testUser.getEmail());
        testUser.setEmail("abc@gmail.com");
        Assert.assertEquals("abc@gmail.com", testUser.getEmail());
    }

    @Test
    public void setId() {
        User testUser = new User();
        Assert.assertNull(testUser.getId());
        testUser.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testUser.getId());
    }

    @Test
    public void setUsername() {
        User testUser = new User();
        Assert.assertNull(testUser.getUsername());
        testUser.setUsername("unicorn");
        Assert.assertEquals("unicorn", testUser.getUsername());
    }

    @Test
    public void setPasswordConfirm() {
        User testUser = new User();
        Assert.assertNull(testUser.getPasswordConfirm());
        testUser.setPasswordConfirm("abc123");
        Assert.assertEquals("abc123", testUser.getPasswordConfirm());
    }
}