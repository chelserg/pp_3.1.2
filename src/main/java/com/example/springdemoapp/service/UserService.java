package com.example.springdemoapp.service;




import com.example.springdemoapp.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(Long id);
    List<User> findAll();
    User findById(Long id);
}
