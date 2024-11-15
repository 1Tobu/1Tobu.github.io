package com.rating.rate_your_mate.backend.controller;


import com.rating.rate_your_mate.backend.controller.dto.UserDTO;
import com.rating.rate_your_mate.backend.repository.entity.User;
import com.rating.rate_your_mate.backend.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rym/users")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:8080/")
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/save")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/check-email")
    public ResponseEntity<Map<String, Boolean>> checkEmailExists(@RequestParam String email) {
        boolean exists = service.existsByEmail(email);
        Map<String, Boolean> response = new HashMap<>();
        response.put("exists", exists);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/check-username")
    public ResponseEntity<Map<String, Boolean>> checkUsernameExists(@RequestParam String username) {
        boolean exists = service.existsByUsername(username);
        Map<String, Boolean> response = new HashMap<>();
        response.put("exists", exists);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        var user = userDTO.from(userDTO);
        service.registerUser(user);
        return ResponseEntity.ok("Benutzer erfolgreich registriert!");
    }
}
