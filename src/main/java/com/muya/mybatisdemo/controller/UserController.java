package com.muya.mybatisdemo.controller;

import com.muya.mybatisdemo.entity.User;
import com.muya.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright 2020 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/3/22
 * @Time: 1:33
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public List<User> hello() {
        return userService.getAll();
    }
}
