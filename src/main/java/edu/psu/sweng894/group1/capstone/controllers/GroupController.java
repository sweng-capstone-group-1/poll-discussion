package edu.psu.sweng894.group1.capstone.controllers;

import edu.psu.sweng894.group1.capstone.data.entities.Group;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/group")
public class GroupController {

    @GetMapping(value = "/newGroup/{id}")
    public @ResponseBody Group createGroup (@PathVariable Integer id, String groupName){
        Group group = new Group(groupName);
        group.setId(id);

        return group;
    }

    @GetMapping(value = "/{group}")
    public String welcome(Group group) {
        return "Welcome" + group.getGroupName();
    }

    @PostMapping(value = "/group/{id}")
    public void addMembers(Group group, @RequestParam(value = "user") User user) {
        Set<User> newMembers = new HashSet<User>();
        newMembers.add(user);
        group.setMembers(newMembers);
    }
}
