package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * A user's selection on a poll.
 */
public class PollSelection {
    private Integer userId;

    private Integer pollOptionId;

    public PollSelection() {}

    public PollSelection(Integer userId, Integer pollOptionId) {
        this.userId = userId;
        this.pollOptionId = pollOptionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPollOptionId() {
        return pollOptionId;
    }

    public void setPollOptionId(Integer pollOptionId) {
        this.pollOptionId = pollOptionId;
    }

    public PollSelection(int userId, int pollOptionId) {
        this.userId = userId;
        this.pollOptionId = pollOptionId;
    }
}
