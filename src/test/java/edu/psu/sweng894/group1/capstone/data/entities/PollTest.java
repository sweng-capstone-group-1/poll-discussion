package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class PollTest {

    @Test
    public void setCreator() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertEquals(Integer.valueOf(1), testPoll.getCreatorId());
        testPoll.setCreatorId(2);
        Assert.assertEquals(Integer.valueOf(2), testPoll.getCreatorId());
    }

    @Test
    public void setCreatedAt() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertEquals(testDate, testPoll.getCreatedAt());
        Date newDate = new Date(2018, 4, 5);
        testPoll.setCreatedAt(newDate);
        Assert.assertEquals(newDate, testPoll.getCreatedAt());
    }

    @Test
    public void setAnonymous() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertFalse(testPoll.getAnonymous());
        testPoll.setAnonymous(true);
        Assert.assertTrue(testPoll.getAnonymous());
    }

    @Test
    public void setOpen() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertFalse(testPoll.getOpen());
        testPoll.setOpen(true);
        Assert.assertTrue(testPoll.getOpen());
    }

    @Test
    public void setId() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertNull(testPoll.getId());
        testPoll.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testPoll.getId());
    }

    @Test
    public void setTitle() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertEquals("test poll", testPoll.getTitle());
        testPoll.setTitle("new test");
        Assert.assertEquals("new test", testPoll.getTitle());
    }

    @Test
    public void setDescription() {
        Date testDate = new Date(2016, 4, 5);
        Poll testPoll = new Poll("test poll", 1, testDate, "this is a test poll", false, false);
        Assert.assertEquals("this is a test poll", testPoll.getDescription());
        testPoll.setDescription("new test description");
        Assert.assertEquals("new test description", testPoll.getDescription());
    }
}