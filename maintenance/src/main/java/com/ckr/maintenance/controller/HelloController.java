package com.ckr.maintenance.controller;

import com.ckr.maintenance.user.service.UserService;
import com.ckr.maintenance.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/5/21.
 */
@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String helloWorld() {
        return "hello";
    }


    @RequestMapping(value = "/allUsers")
    @ResponseBody
    public List<User> allUsers() {
        return userService.getAllUsers();
    }


}
