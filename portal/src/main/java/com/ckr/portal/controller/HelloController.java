package com.ckr.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/19.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello " + new Date(System.currentTimeMillis());
    }

    @RequestMapping(value = "/hello1")
    @ResponseBody
    public void hello1(HttpServletResponse response){
        try {
            response.getWriter().println("hello " + new Date(System.currentTimeMillis()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
