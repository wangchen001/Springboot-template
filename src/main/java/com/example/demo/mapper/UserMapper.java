package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author wangchen
 * @date 2020/5/24 16:10
 */
@Repository
public interface UserMapper {
     User queryUserInfoById(int id);

     User queryUserInfoByName(String name);
}
