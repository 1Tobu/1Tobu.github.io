package com.rating.rate_your_mate.backend.controller;


import com.rating.rate_your_mate.backend.controller.dto.UserDTO;
import com.rating.rate_your_mate.backend.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/check-email")
    public ResponseEntity<Map<String, Boolean>> checkEmailExists(@RequestParam String email) {
        boolean exists = service.existsByEmail(email); // Implementiere dies in deinem Repository
        Map<String, Boolean> response = new HashMap<>();
        response.put("exists", exists);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/check-username")
    public ResponseEntity<Map<String, Boolean>> checkUsernameExists(@RequestParam String username) {
        boolean exists = service.existsByUsername(username); // Implementiere dies in deinem Repository
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
