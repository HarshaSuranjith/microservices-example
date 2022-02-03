package com.sourcedrift.microservices.userservice.controller;

import com.sourcedrift.microservices.userservice.entity.User;
import com.sourcedrift.microservices.userservice.service.UserService;
import com.sourcedrift.microservices.userservice.vo.UserDepartment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public User create(@RequestBody User user) {
        log.info("Creating user : " + user);
        return this.userService.create(user);
    }

    @GetMapping("/{id}")
    public UserDepartment findUserDepartment(@PathVariable Long id) {
        log.info("Fetching user for id: " + id);
        return this.userService.findUserDepartment(id);
    }

}
