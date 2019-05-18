package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Poll;
import edu.psu.sweng894.group1.capstone.data.entities.PollOption;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.PollRepository;

import java.util.List;

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

    public List<User> getPollAdmins() {
        return null;
    }

    public List<PollOption> getPolOptions() {
        return null;
    }
}
