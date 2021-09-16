package com.javacase.sagar.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @RequestMapping("/")
    public String allAccessUri(){
        return "All access uri";
    }

    @RequestMapping("/user")
    public String userRoleAccess(){
        return "Welcome, USER";
    }

    @RequestMapping("/admin")
    public String adminRoleAccess(){
        return "Welcome, ADMIN";
    }
}
