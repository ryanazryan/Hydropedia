/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.controller;

import com.hydropedia.hydropedia.model.User;
import com.hydropedia.hydropedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

/**
 *
 * @author Ryan
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(
            @RequestParam String username,
            @RequestParam String password) {

        User user
                = new User(username, password);

        userService.register(user);

        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        boolean success
                = userService.login(username, password);

        if (success) {
            return "redirect:/dashboard";
        }

        model.addAttribute(
                "error",
                "Username atau Password salah"
        );

        return "login";
    }
}
