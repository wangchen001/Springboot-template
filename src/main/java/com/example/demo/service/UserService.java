package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangchen
 * @date 2020/5/24 15:55
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserInfoById(int id){
        return userMapper.queryUserInfoById(id);
    }
}
