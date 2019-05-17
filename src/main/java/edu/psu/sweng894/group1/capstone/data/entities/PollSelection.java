package edu.psu.sweng894.group1.capstone.data.entities;

/**
 * A user's selection on a poll.
 */
public class PollSelection {

    private Integer poll;

    private Integer user;

    private Integer pollOptions;

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getPollOptions() {
        return pollOptions;
    }

    public void setPollOptions(Integer pollOptions) {
        this.pollOptions = pollOptions;
    }
}
