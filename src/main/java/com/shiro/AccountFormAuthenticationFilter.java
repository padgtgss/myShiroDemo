package com.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Description: AccountFormAuthenticationFilter
 * @anthor: shi_lin
 * @CreateTime: 2016-01-05
 */

public class AccountFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession(false);
        if(session != null){
            session.setAttribute(WebUtils.SAVED_REQUEST_KEY,null);
        }


        UsernamePasswordToken token = new UsernamePasswordToken(
                getUsername(request),
                getPassword(request),
                isRememberMe(request));
        return token;
    }
}
