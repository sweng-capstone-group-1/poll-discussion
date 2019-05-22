package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Poll;
import edu.psu.sweng894.group1.capstone.data.entities.PollSelection;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.PollSelectionRepository;

public class PollSelectionService {

    private PollSelectionRepository pollSelectionRepository;

    public PollSelectionService(PollSelectionRepository pollSelectionRepository) {
        this.pollSelectionRepository = pollSelectionRepository;
    }

    public PollSelection addVote(Poll poll, User user) {
        return null;
    }

    public PollSelection removeVote(Poll poll, User user) {
        return null;
    }


}
