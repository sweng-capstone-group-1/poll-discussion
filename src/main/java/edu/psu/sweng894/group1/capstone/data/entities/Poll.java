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
    /**
     * Maybe the user can choose only one option or they can chose two options, or three.
     */
    private Integer numberOfOptionsAllowed;

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

    private String description;

    public Integer getNumberOfOptionsAllowed() {
        return numberOfOptionsAllowed;
    }

    public void setNumberOfOptionsAllowed(Integer numberOfOptionsAllowed) {
        this.numberOfOptionsAllowed = numberOfOptionsAllowed;
    }
}
