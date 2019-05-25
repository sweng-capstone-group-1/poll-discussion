package edu.psu.sweng894.group1.capstone.data.entities;

import java.util.Date;

/**
 * Main entity for a poll.
 */
public class Poll {

    private Integer id;

    /**
     * The title, shown in lists of polls.
     */
    private String title;

    private Integer creatorId;

    private Date createdAt;

    private String description;

    private Boolean anonymous;

    private Boolean open;

    public Poll() {
    }

    public Poll(String title, Integer creatorId, Date createdAt, String description, Boolean anonoymous, Boolean open) {
        this.title = title;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.description = description;
        this.anonymous = anonoymous;
        this.open = open;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date creationDate) {
        this.createdAt = creationDate;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
