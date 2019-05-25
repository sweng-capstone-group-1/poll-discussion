package edu.psu.sweng894.group1.capstone.data.entities;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class CommentTest {
    @Test
    public void setId() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        testComment.setId(1);
        Assert.assertEquals(Integer.valueOf(1), testComment.getId());
    }

    @Test
    public void setPollId() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertEquals(Integer.valueOf(1), testComment.getPollId());
        testComment.setPollId(2);
        Assert.assertEquals(Integer.valueOf(2), testComment.getPollId());
    }

    @Test
    public void setContent() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertEquals("let's have a party", testComment.getContent());
        testComment.setContent("new content");
        Assert.assertEquals("new content", testComment.getContent());
    }

    @Test
    public void setCreatorId() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertEquals(Integer.valueOf(1), testComment.getCreatorId());
        testComment.setCreatorId(2);
        Assert.assertEquals(Integer.valueOf(2), testComment.getCreatorId());
    }

    @Test
    public void setCreationDate() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertEquals(testDate, testComment.getCreationDate());
        Date newDate = new Date(2018, 4, 5);
        testComment.setCreationDate(newDate);
        Assert.assertEquals(newDate, testComment.getCreationDate());
    }

    @Test
    public void setUpdatedBy() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertNull(testComment.getUpdatedBy());
        testComment.setUpdatedBy(2);
        Assert.assertEquals(Integer.valueOf(2), testComment.getUpdatedBy());
    }

    @Test
    public void setUpdatedAt() {
        Date testDate = new Date(2016, 4, 5);
        Comment testComment = new Comment(1, 1, testDate, "let's have a party");
        Assert.assertNull(testComment.getUpdatedAt());
        testComment.setUpdatedAt(testDate);
        Assert.assertEquals(testDate, testComment.getUpdatedAt());
    }
}