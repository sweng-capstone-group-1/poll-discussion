package edu.psu.sweng894.group1.capstone.data.entities;

import java.util.Date;

/**
 * Models a comment, or a reply to a poll.
 */
public class Comment {

    /**
     * Unique identifier of this comment.
     */
    private Integer id;

    /**
     * The poll for this comment.
     */
    private Integer pollId;
    private String content;
    private Integer creatorId;
    private Date creationDate;
    private Integer updatedBy;
    private Date updatedAt;

    public Comment(Integer pollId, Integer creatorId, Date creationDate, String content) {
        this.pollId = pollId;
        this.creatorId = creatorId;
        this.creationDate = creationDate;
        this.content = content;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
