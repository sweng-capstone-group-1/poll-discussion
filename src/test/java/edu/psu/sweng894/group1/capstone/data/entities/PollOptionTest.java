package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PollOptionTest {

    @Test
    public void setId() {
        PollOption testOption = new PollOption(1, "test option");
        Assert.assertNull(testOption.getId());
        testOption.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testOption.getId());
    }

    @Test
    public void setPollId() {
        PollOption testOption = new PollOption(1, "test option");
        Assert.assertEquals(Integer.valueOf(1), testOption.getPollId());
        testOption.setPollId(2);
        Assert.assertEquals(Integer.valueOf(2), testOption.getPollId());
    }

    @Test
    public void setDescription() {
        PollOption testOption = new PollOption(1, "test option");
        Assert.assertEquals("test option", testOption.getDescription());
        testOption.setDescription("new description");
        Assert.assertEquals("new description", testOption.getDescription());
    }

    @Test
    public void setHelpText() {
        PollOption testOption = new PollOption(1, "test option");
        Assert.assertNull(testOption.getHelpText());
        testOption.setHelpText("helper test text");
        Assert.assertEquals("helper test text", testOption.getHelpText());
    }
}