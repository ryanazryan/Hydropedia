/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hydropedia.hydropedia.service;
import com.hydropedia.hydropedia.model.User;
import com.hydropedia.hydropedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Ryan
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public boolean login(String username, String password) {
        List<User> users = userRepository.findByUsername(username);
        if (users != null && !users.isEmpty()) {
            User user = users.get(0);
            return user.getPassword().equals(password);
        }
        return false;
    }
}
