package com.javacase.sagar.resource;

import com.javacase.sagar.model.User;
import com.javacase.sagar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping("/users/{username}")
    public User getUsers(@PathVariable String username){
        return userRepository.findByUsername(username).get();
    }
}
