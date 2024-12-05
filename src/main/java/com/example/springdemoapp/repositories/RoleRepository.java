package com.example.springdemoapp.repositories;


import com.example.springdemoapp.models.Role;
import com.example.springdemoapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

    Set<Role> findByUsers(User user);
}
