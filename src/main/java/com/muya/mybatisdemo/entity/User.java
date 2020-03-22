package com.muya.mybatisdemo.entity;

import lombok.Data;

/**
 * Copyright 2020 OnlySilence, Inc. All rights reserved.
 *
 * @Author: MuYa
 * @Date: 2020/3/22
 * @Time: 1:33
 * @Description:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
