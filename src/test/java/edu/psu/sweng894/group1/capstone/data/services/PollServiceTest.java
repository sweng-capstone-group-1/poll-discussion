package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Poll;
import edu.psu.sweng894.group1.capstone.data.repositories.PollRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PollServiceTest {

    private PollService pollService;

    @Before
    public void before() {
        // stub the repository
        PollRepository repo = new PollRepository() {

        };

        pollService = new PollService(repo);

    }

    @Test
    public void testPollInsertion() {

        Poll inputPoll = new Poll();
        inputPoll.setTitle("Test Poll");

        Poll resultPoll = pollService.createPoll(inputPoll);
        Assert.assertNotNull("Result Poll is null", resultPoll);
        Assert.assertNotNull("poll id is null", resultPoll.getId());
        Assert.assertEquals(inputPoll.getTitle(), resultPoll.getTitle());
    }

    @Test
    public void testPollUpdate() {

        Poll inputPoll = new Poll();
        inputPoll.setTitle("Test Poll");

        Poll resultPoll = pollService.createPoll(inputPoll);

        String newTitle = "Updated Title";
        resultPoll.setTitle(newTitle);

        Poll updatedPoll = pollService.updatePoll(resultPoll);
        Assert.assertNotNull("Updated Poll is null", updatedPoll);
        Assert.assertEquals(newTitle, updatedPoll.getTitle());

    }

}