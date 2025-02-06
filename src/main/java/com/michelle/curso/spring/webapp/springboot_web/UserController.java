package com.michelle.curso.spring.webapp.springboot_web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.michelle.curso.spring.webapp.springboot_web.models.User;



@Controller

public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Michelle", "Barriga");
        user.setEmail("barriga.michelle@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users =  Arrays.asList(
            new User("Pepa", "Gonzales", "pepa@gmail.com"),
            new User("Juan", "Perez", "juan@gmail.com"),
            new User("Lalo", "Perez"),
            new User("Andres", "Doe"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usarios");
        return "list";
    }
    

}
