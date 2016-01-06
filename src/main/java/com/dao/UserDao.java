package com.dao;

import com.persist.User;

/**
 * @Description: UserDao
 * @anthor: shi_lin
 * @CreateTime: 2016-01-06
 */
public interface UserDao {

    User get(String username,String password);

    User login(String username);
}
