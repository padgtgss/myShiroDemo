package com.dao.impl;

import com.dao.UserDao;
import com.persist.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @Description: UserDaoImpl
 * @anthor: shi_lin
 * @CreateTime: 2016-01-06
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    protected EntityManager em;

    @Override
    public User get(String username, String password) {
        String sql = "from User u where u.username = ?1 and u.password = ?2";
        Query query = em.createQuery(sql);
        query.setParameter(1,username);
        query.setParameter(2,password);
        Object singleResult = query.getSingleResult();
        return singleResult == null ? null : (User)singleResult;
    }
}
