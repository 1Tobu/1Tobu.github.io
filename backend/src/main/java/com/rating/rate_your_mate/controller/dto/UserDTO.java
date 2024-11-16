package com.rating.rate_your_mate.controller.dto;

import com.rating.rate_your_mate.repository.entity.User;

public record UserDTO(String username, String password, String email) {
    public User from(UserDTO userDTO) {
        return new User(userDTO.username, userDTO.password, userDTO.email);
    }

    public UserDTO from(User user) {
        return new UserDTO(user.getUsername(), user.getPassword(), user.getEmail());
    }
}
