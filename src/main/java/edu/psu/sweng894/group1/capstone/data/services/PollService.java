package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Poll;
import edu.psu.sweng894.group1.capstone.data.repositories.PollRepository;

public class PollService {

    private PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return null;
    }

    public Poll updatePoll(Poll poll) {
        return null;
    }

    public Poll deletePoll(Poll poll) {
        return null;
    }
}
