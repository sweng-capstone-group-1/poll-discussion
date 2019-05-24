package edu.psu.sweng894.group1.capstone.data.entities;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PollSelectionTest {

    @Test
    public void setUserId() {
        PollSelection testSelection = new PollSelection(1, 1);
        Assert.assertEquals(Integer.valueOf(1), testSelection.getUserId());
        testSelection.setUserId(2);
        Assert.assertEquals(Integer.valueOf(2), testSelection.getUserId());
    }

    @Test
    public void setPollOptionId() {
        PollSelection testSelection = new PollSelection(1, 1);
        Assert.assertEquals(Integer.valueOf(1), testSelection.getPollOptionId());
        testSelection.setPollOptionId(2);
        Assert.assertEquals(Integer.valueOf(2), testSelection.getPollOptionId());
    }
}