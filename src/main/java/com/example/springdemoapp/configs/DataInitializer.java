package com.example.springdemoapp.configs;

import com.example.springdemoapp.models.User;
import com.example.springdemoapp.services.RoleService;
import com.example.springdemoapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.springdemoapp.models.Role;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class DataInitializer {

    private final UserService userService;
    private final RoleService roleService;


    @Autowired
    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;

    }

    @PostConstruct
    public void init() {
        Role roleAdmin = roleService.findByName("ROLE_ADMIN");
        if (roleAdmin == null) {
            roleAdmin = new Role("ROLE_ADMIN");
            roleService.saveRole(roleAdmin);
        }

        Role roleUser = roleService.findByName("ROLE_USER");
        if (roleUser == null) {
            roleUser = new Role("ROLE_USER");
            roleService.saveRole(roleUser);
        }


        User admin = userService.findByUsername("admin");
        if (admin == null) {
            admin = new User("admin", "admin", Set.of(roleAdmin, roleUser));
            userService.saveUser(admin);
        }

        User user = userService.findByUsername("user");
        if (user == null) {
            user = new User("user", "user", Set.of(roleUser));
            userService.saveUser(user);
        }
    }
}