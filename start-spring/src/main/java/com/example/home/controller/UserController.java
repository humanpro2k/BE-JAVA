package com.example.home.controller;

import com.example.home.entity.User;
import com.example.home.model.dto.UserDTO;
import com.example.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //@RequestMapping(value="/users", method = RequestMethod.GET)
    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        List<UserDTO> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("search")
    public ResponseEntity<?> searchUser(@RequestParam(name ="keyword", required = false, defaultValue = "") String name){
        List<UserDTO> users = userService.searchUser(name);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id){
        UserDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){

        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }
}
