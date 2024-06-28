package com.example.socialnetwork.mapper;

import com.example.socialnetwork.dto.RegisterRequest;
import com.example.socialnetwork.model.User;

import java.util.Collections;
import java.util.HashSet;

public class UserMapper {

    public static User toUser(RegisterRequest registerRequest) {
        if (registerRequest == null) {
            return null;
        }

        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setRoles(new HashSet<>(Collections.singletonList("ROLE_USER")));
        return user;
    }
}
