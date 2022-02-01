package com.scode.controller;

import com.scode.entity.UserEntity;
import com.scode.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
