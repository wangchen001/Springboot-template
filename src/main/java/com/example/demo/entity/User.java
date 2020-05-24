package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author wangchen
 * @date 2020/5/24 15:59
 */
@Data
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

    private Date birthday;
}
