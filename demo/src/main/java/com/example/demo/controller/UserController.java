package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User createdUser = userService.addUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        try {
            // Long userId = String.parseLong(id);
            User updated = userService.updateUser(id, updatedUser);
            return ResponseEntity.ok(updated);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        boolean isDeleted = userService.deleteUser(id);
        if (isDeleted) {
            return ResponseEntity.ok("User deleted.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }
    }

}

// package com.example.demo.controller;

// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.Collection;

// @CrossOrigin(origins = "http://localhost:3000")
// @RestController
// @RequestMapping("/api/users")
// public class UserController {

// @Autowired
// private UserService userService;

// @GetMapping
// public Collection<User> getUsers() {
// return userService.getAllUsers();
// }

// @PostMapping
// public ResponseEntity<String> addUser(@RequestBody User user) {
// userService.addUser(user);
// return ResponseEntity.status(HttpStatus.CREATED).body("User added.");
// }

// @PutMapping("/{id}")
// public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody
// User updatedUser) {
// User updated = userService.updateUser(id, updatedUser);
// return updated != null
// ? ResponseEntity.ok(updated)
// : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
// }

// @DeleteMapping("/{id}")
// public ResponseEntity<String> deleteUser(@PathVariable Long id) {
// boolean isDeleted = userService.deleteUser(id);
// return isDeleted
// ? ResponseEntity.ok("User deleted.")
// : ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
// }
// }

// // package com.example.demo.controller;

// // import com.example.demo.model.User;
// // import com.example.demo.service.UserService;
// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.http.HttpStatus;
// // import org.springframework.http.ResponseEntity;
// // import org.springframework.web.bind.annotation.*;

// // import java.util.Collection;

// // @CrossOrigin(origins = "http://localhost:3000")
// // @RestController
// // @RequestMapping("/api/users")
// // public class UserController {

// // @Autowired
// // private UserService userService;

// // @GetMapping
// // public Collection<User> getUsers() {
// // return userService.getAllUsers();
// // }

// // @PostMapping
// // public String addUser(@RequestBody User user) {
// // userService.addUser(user);
// // return "User added.";
// // }

// // @PutMapping("/{id}")
// // public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody
// User
// // updatedUser) {
// // // logic to update user
// // return ResponseEntity.ok("User updated");
// // }

// // @DeleteMapping("/{id}")
// // public ResponseEntity<String> deleteUser(@PathVariable Long id) {
// // boolean isDeleted = userService.deleteUser(id);
// // if (isDeleted) {
// // return ResponseEntity.ok("User deleted.");
// // } else {
// // return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not
// found.");
// // }
// // }

// // }
