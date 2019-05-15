package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.CapstoneProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controllers - respond to HTTP requests. All requests to this controller are under the "/hello" path (which itself is under the path defined in application.yml).
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    private Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    private CapstoneProperties capstoneProperties;

    public HelloWorldController(CapstoneProperties capstoneProperties) {
        this.capstoneProperties = capstoneProperties;
    }

    /**
     * Print "Hello World!"
     *
     * @return
     */
    @GetMapping("/sayHi")
    @ResponseBody
    public String hello() {
        log.trace("hello - enter()");
        return capstoneProperties.getHelloString();
    }
}
