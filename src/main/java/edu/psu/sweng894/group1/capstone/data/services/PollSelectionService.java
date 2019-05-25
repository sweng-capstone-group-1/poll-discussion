package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.PollOption;
import edu.psu.sweng894.group1.capstone.data.entities.PollSelection;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.PollSelectionRepository;

public class PollSelectionService {

    private PollSelectionRepository pollSelectionRepository;

    public PollSelectionService(PollSelectionRepository pollSelectionRepository) {
        this.pollSelectionRepository = pollSelectionRepository;
    }

    // This definitely isn't entirely correct, but should work in the meantime. However,
    // I'm not entirely sure what pattern we want to follow...
    public PollSelection addVote(PollOption pollOption, User user) {
        PollSelection pollSelection = new PollSelection(user.getId(), pollOption.getId());
        return pollSelection;
    }

    public PollSelection removeVote(PollOption pollOption, User user) {
        return null;
    }


}
