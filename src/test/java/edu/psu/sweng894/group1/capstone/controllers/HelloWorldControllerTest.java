package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.CapstoneProperties;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldControllerTest {

    @Test
    public void testCreate() {
        String testString = "Test String";

        CapstoneProperties props = new CapstoneProperties();
        props.setHelloString(testString);

        HelloWorldController controller = new HelloWorldController(props, null);
        //String hello = controller.hello();

       // Assert.assertEquals(testString, hello);
    }
}
