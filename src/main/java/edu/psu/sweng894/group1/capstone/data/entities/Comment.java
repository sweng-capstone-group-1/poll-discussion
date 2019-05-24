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
     * The parent, optional, of this comment. If this comment is a reply to a comment, this
     * is non-null. If this comment is attached directly to a poll, this is null.
     */
    // I think this is premature. We don't need to do threading yet and we should add this when it's needed
    private Integer parentId;

    /**
     * The poll for this comment.
     */
    private Integer poll;

    private Integer creator;
    private Date creationDate;
    private Integer updatedBy;
    private Integer updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
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

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAT(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }
}
