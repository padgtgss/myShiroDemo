package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: ShiroController
 * @anthor: shi_lin
 * @CreateTime: 2016-01-05
 */
@Controller
public class ShiroController {

    @RequestMapping(value = "/login")
    public String login(String password, String username) {
        Object principal = SecurityUtils.getSubject().getPrincipal();
        System.out.println("9798798");
        return "redirect:login.jsp";

    }

    @RequestMapping(value = "/list")
    public String list(){
        System.out.println("go to list jsp");
        return "list";
    }


    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess(){

        return "success";
    }
}
