package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.PollSelection;
import edu.psu.sweng894.group1.capstone.data.repositories.PollSelectionRepository;

public class PollSelectionService {

    private PollSelectionRepository pollSelectionRepository;

    public PollSelectionService(PollSelectionRepository pollSelectionRepository) {
        this.pollSelectionRepository = pollSelectionRepository;
    }

    public PollSelection createPollSelection(PollSelection pollSelection) {
        return null;
    }

    public PollSelection updatePollSelection(PollSelection pollSelection) {
        return null;
    }

    public PollSelection deletePollSelection(PollSelection pollSelection) {
        return null;
    }
}
