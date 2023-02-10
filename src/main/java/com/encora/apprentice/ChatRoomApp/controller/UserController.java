package com.encora.apprentice.ChatRoomApp.controller;

import com.encora.apprentice.ChatRoomApp.controller.model.User;
import com.encora.apprentice.ChatRoomApp.controller.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @CrossOrigin
    public List<User> getUsersList() {
        System.out.println(userService.getUsersList());
        return userService.getUsersList();
    }

    @GetMapping("/users/{id}")
    @CrossOrigin
    public List<User> getUsersByChatRoom(@PathVariable UUID id) {
        if (id != null) {
            List<User> chatRoomUsers = new ArrayList<>();
            for (User user : userService.getUsersList()) {
                if (user.getChatRoomId().equals(id)) {
                    chatRoomUsers.add(user);
                }
            }
            return chatRoomUsers;
        } throw new RuntimeException();

    }

    @PostMapping("/register")
    @CrossOrigin
    public User registerUser(@RequestBody User user) {
        return userService.setUser(user);
    }

    @PutMapping("/login")
    @CrossOrigin
    public User loginUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}
