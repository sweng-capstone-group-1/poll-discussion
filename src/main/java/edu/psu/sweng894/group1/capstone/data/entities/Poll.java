package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Main entity for a poll.
 */
public class Poll {

    private Integer id;

    /**
     * The title, shown in lists of polls.
     */
    private String title;

    private Integer creator;

    private Integer createdAt;

    private String description;

    private Boolean anonymous;

    private Boolean open;


    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer creationDate) {
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
