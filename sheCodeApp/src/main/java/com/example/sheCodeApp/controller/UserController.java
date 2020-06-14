package com.example.sheCodeApp.controller;

import com.example.sheCodeApp.service.UserService;
import com.example.sheCodeApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RequestMapping("myApp/oneGroup")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@Valid @NotNull @RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping(path = {"id"})
    public User getUsersById(@PathVariable("id") UUID id){
        return userService.getAllUsersById(id)
                .orElse(null);
    }
    @DeleteMapping(path = {"id"})
    public void deleteUserById(@PathVariable("id")UUID id){
        userService.deleteUserById(id);
    }
    @PostMapping(path = {"id"})
    public void updateUserById(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody User userToUpdate){
        userService.updateUserById(id, userToUpdate);
    }


}

