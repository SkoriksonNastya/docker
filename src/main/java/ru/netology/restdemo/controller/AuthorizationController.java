package ru.netology.restdemo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.restdemo.enums.Authorities;
import ru.netology.restdemo.model.User;
import ru.netology.restdemo.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }
}