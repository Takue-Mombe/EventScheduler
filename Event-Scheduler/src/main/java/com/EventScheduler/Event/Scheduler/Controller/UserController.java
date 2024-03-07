package com.EventScheduler.Event.Scheduler.Controller;

import com.EventScheduler.Event.Scheduler.EventModel.Users;
import com.EventScheduler.Event.Scheduler.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return userService.registerUser(user);
    }

    @GetMapping("/login")
    public String loginUser() {
        return "Login successful!";
    }
}
