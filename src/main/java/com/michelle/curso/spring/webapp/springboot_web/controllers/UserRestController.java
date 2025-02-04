package com.michelle.curso.spring.webapp.springboot_web.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michelle.curso.spring.webapp.springboot_web.models.User;
import com.michelle.curso.spring.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public UserDto details() {
        User user = new User("Michelle", "Barriga");

        UserDto userDto = new UserDto();
       
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");


        return userDto;
    }
    public List<User> list(){
        User user = new User("Michelle", "Barriga");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("Juan", "Doe");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @GetMapping(path="/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Michelle", "Barriga");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }

}
 