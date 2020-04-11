package com.letunnel.controllers;

import com.letunnel.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listUsers(Model model){

        model.addAttribute("users", userService.findAll());

        return "users/index";

    }

}
