package com.example.dictionarydemo.controller;


import com.example.dictionarydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerTest {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "xzl";
    }

    @RequestMapping("/user/findUserById/{id}")
    public List findUserById(@PathVariable Integer id) {
        List userList = userService.findByUserId(id);
        return userList;
    }

    @RequestMapping("/user/findAll")
    public List findAll() {
        return userService.findAll();
    }

//    @RequestMapping("/dictionary/word/suggestion/{word}")
//    public List suggestion(@PathVariable String word) {
//
//    }
//
//    @RequestMapping("/dictionary/word/query/{word}")
//    public List suggestion(@PathVariable String word) {
//
//    }
}
