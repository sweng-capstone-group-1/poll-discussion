package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.CapstoneProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@IfProfileValue(name = "test-group", value = "integration") // only run if property set, so we do not run when building
@TestPropertySource("classpath:application-test.properties")
public class HelloWorldControllerIntegrationTest {

    @Autowired
    private CapstoneProperties capstoneProperties;

    @Test
    public void testCreate() {
        Assert.assertNotNull(capstoneProperties);
        // comes from application-test.properties
        Assert.assertEquals("From Test Props!", capstoneProperties.getHelloString());

    }
}
