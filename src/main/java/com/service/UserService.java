package com.service;

import com.persist.User;

/**
 * @Description: UserService
 * @anthor: shi_lin
 * @CreateTime: 2016-01-06
 */
public interface UserService {

    User login(String username,String password);
}
