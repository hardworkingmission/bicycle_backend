package org.bicycle.backend.controllers;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bicycle.backend.models.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@ResponseBody, User user){

    }
}
