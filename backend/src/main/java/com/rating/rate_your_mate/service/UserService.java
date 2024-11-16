package com.rating.rate_your_mate.service;

import com.rating.rate_your_mate.repository.UserRepository;
import com.rating.rate_your_mate.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public Boolean deleteUser(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
