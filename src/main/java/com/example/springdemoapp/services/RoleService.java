package com.example.springdemoapp.services;


import com.example.springdemoapp.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Role findByName(String name);

    Role findById(Long id);

    void saveRole(Role role);

    void deleteById(Long id);
}
