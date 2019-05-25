package edu.psu.sweng894.group1.capstone.data.entities;
import org.junit.Assert;
import org.junit.Test;

public class GroupTest {
    @Test
    public void setId() {
        Group testGroup = new Group("pony party");
        Assert.assertNull(testGroup.getId());
        testGroup.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testGroup.getId());
    }

    @Test
    public void setGroupName() {
        Group testGroup = new Group("pony party");
        Assert.assertEquals("pony party", testGroup.getGroupName());
        testGroup.setGroupName("no party");
        Assert.assertEquals("no party", testGroup.getGroupName());
    }
}
