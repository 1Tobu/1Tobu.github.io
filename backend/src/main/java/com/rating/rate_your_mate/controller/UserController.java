package com.rating.rate_your_mate.controller;



import com.rating.rate_your_mate.controller.dto.UserDTO;
import com.rating.rate_your_mate.repository.entity.User;
import com.rating.rate_your_mate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

@RestController
@RequestMapping("/rym/users")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:8080/")
public class UserController {
    private final UserService service;

    @GetMapping
    public List<UserDTO> getUsers() {
        return service.getUsers().stream()
                .map(this::from)
                .toList();
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable("id") Long id) throws Exception {
        var userOptional = service.getUser(id);
        return userOptional
                .map(this::from)
                .orElseThrow(() -> new Exception(format("User not found with id: %d", id)));
    }

    @PostMapping("/save")
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        var user = service.addUser(from(userDTO));
        return from(user);
    }


    @PutMapping("/update/{id}")
    public UserDTO updateUser(@PathVariable("id") Long id, @RequestBody UserDTO userDTO) {
        //TODO: Add update method
        var user = service.addUser(from(userDTO));
        return from(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") Long id) {
        return service.deleteUser(id);
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

    private User from(UserDTO userDTO) {
        return new User(userDTO.username(), userDTO.password(), userDTO.email());
    }

    private UserDTO from(User user) {
        return new UserDTO(user.getUsername(), user.getPassword(), user.getEmail());
    }
}
