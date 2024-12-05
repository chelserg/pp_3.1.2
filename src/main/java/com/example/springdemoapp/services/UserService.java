package com.example.springdemoapp.services;

import com.example.springdemoapp.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findByUsername(String username);

    User findById(Long id);

    void saveUser(User user);

    void update(Long id, User user);

    void deleteById(Long id);
}
