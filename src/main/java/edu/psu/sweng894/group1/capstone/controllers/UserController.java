package edu.psu.sweng894.group1.capstone.controllers;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class UserController {

	@GetMapping({"/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}
