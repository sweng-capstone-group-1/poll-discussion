package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * Represents a poll options. As in, if a poll asks a user to chose between A, B and C, this represents one particular
 * A, B or C
 */
public class PollOption {

    private Integer id;
    /**
     * Relates this option to a poll.
     */
    private Integer pollId;
    /**
     * The primary text the user sees when selecting.
     */
    private String description;
    /**
     * Could be additional details about the description.
     */
    private String helpText;

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
}
