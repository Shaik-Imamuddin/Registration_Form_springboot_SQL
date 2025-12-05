package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody User user) {

        Map<String, Object> response = new HashMap<>();

        if (user.getUsername() == null ||
                user.getEmail() == null ||
                user.getPhone() == null ||
                user.getPassword() == null) {

            response.put("success", false);
            response.put("message", "All fields are required");
            return response;
        }

        try {
            userService.save(user);
            response.put("success", true);
            response.put("message", "User Registered Successfully!");
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", e.getMessage());
        }

        return response;
    }
}
