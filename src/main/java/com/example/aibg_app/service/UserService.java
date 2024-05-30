package com.example.aibg_app.service;

import com.example.aibg_app.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}
