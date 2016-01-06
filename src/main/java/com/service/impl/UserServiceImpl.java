package com.service.impl;

import com.dao.UserDao;
import com.persist.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: UserServiceImpl
 * @anthor: shi_lin
 * @CreateTime: 2016-01-06
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User login(String username, String password) {
        return null;
    }
}
