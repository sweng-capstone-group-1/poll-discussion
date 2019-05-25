package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.PollOption;
import edu.psu.sweng894.group1.capstone.data.entities.PollSelection;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.PollSelectionRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PollSelectionServiceTest {

    private PollSelectionService pollSelectionService;

    @Before
    public void before() {
        // stub the repository
        PollSelectionRepository repo = new PollSelectionRepository() {

        };

        pollSelectionService = new PollSelectionService(repo);

    }

    @Test
    public void addVote() {
        PollOption testOption = new PollOption();
        testOption.setId(1);
        User testUser = new User();
        testUser.setId(2);
        PollSelection testPollSelection = pollSelectionService.addVote(testOption, testUser);
        Assert.assertEquals(testPollSelection.getPollOptionId(), testOption.getId());
        Assert.assertEquals(testPollSelection.getUserId(), testUser.getId());
    }

}