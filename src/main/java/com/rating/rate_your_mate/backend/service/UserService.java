package com.rating.rate_your_mate.backend.service;

import com.rating.rate_your_mate.backend.repository.UserRepository;
import com.rating.rate_your_mate.backend.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User registerUser(User user) {
        return repository.save(user);
    }

    public Boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    public Boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User addUser(User user) {
        return repository.save(user);
    }
}
