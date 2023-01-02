package com.greenman.user;

import com.greenman.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository userRepository;
    @PostMapping("/register")
    public String register() {
        return "user token";
    }
    @PostMapping("/login")
    public String login() {
        return "user token";
    }
}
