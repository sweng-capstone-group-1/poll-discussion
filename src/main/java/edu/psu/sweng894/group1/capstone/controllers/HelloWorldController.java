package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.CapstoneProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controllers - respond to HTTP requests. All requests to this controller are under the "/hello" path (which itself is under the path defined in application.yml).
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    private Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    private CapstoneProperties capstoneProperties;
    private DataSource dataSource;

    public HelloWorldController(@Autowired CapstoneProperties capstoneProperties, @Autowired DataSource dataSource) {
        this.capstoneProperties = capstoneProperties;
        this.dataSource = dataSource;
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
        JdbcTemplate t = new JdbcTemplate(dataSource);
        List<String> names = t.queryForList("select name from test", String.class);
        String allNames = names.stream().collect(Collectors.joining(","));
        return capstoneProperties.getHelloString() + " db list: " + allNames;
    }

    @GetMapping("helloJsp")
    public String helloJsp() {
        return "hello";
    }
}
