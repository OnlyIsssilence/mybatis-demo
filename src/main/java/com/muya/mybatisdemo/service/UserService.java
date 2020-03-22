package com.muya.mybatisdemo.service;

import com.muya.mybatisdemo.dao.UserMapper;
import com.muya.mybatisdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright 2020 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/3/22
 * @Time: 1:33
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.selectList(null);
    }
}
