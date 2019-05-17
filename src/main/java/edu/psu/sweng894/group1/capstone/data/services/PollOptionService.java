package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.PollOption;
import edu.psu.sweng894.group1.capstone.data.repositories.PollOptionRepository;

public class PollOptionService {

    private PollOptionRepository pollOptionRepository;

    public PollOptionService(PollOptionRepository pollOptionRepository) {
        this.pollOptionRepository = pollOptionRepository;
    }

    public PollOption createPollOption(PollOption pollOption) {
        return null;
    }

    public PollOption updatePollOption(PollOption pollOption) {
        return null;
    }

    public PollOption deletePollOption(PollOption pollOption) {
        return null;
    }
}
