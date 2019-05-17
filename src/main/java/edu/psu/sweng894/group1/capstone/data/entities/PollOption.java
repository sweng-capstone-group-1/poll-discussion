package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Represents a poll options. As in, if a poll asks a user to chose between A, B and C, this represents one particular
 * A, B or C
 */
public class PollOption {

    private Integer id;
    /**
     * We may give the users options: A, B or C or 1, 2 or 3.
     */
    private String displayId;
    /**
     * Relates this option to a poll.
     */
    private Integer poll;
    /**
     * The primary text the user sees when selecting.
     */
    private String description;
    /**
     * Could be additional details about the description.
     */
    private String helpText;
    /**
     * The order in wihich this poll appears in the list.
     */
    private Integer order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
