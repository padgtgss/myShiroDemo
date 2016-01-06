package com.shiro;

import com.google.common.collect.ImmutableList;
import com.persist.User;
import com.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;


/**
 * @Description: MyRealm
 * @anthor: shi_lin
 * @CreateTime: 2016-01-04
 */

public class MyRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) principals.fromRealm(getName()).iterator().next();
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            info.addStringPermissions(ImmutableList.of(user.getHasRole()));
            return info;
        } else {
            return null;
        }

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        User user = userService.login(upToken.getUsername());   //无需验证密码，shiro会自动比对
        if (user == null) {
            throw new UnknownAccountException("No account found for user [" + user.getUsername() + "]");
        }

        return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
    }
}
