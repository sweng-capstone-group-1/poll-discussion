package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * A user's selection on a poll.
 */
public class PollSelection {
    private Integer user;

    // a poll option is tied to a poll, so we don't also need a poll here
    private Integer pollOptionId;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getPollOptionId() {
        return pollOptionId;
    }

    public void setPollOptionId(Integer pollOptionId) {
        this.pollOptionId = pollOptionId;
    }
}
