package com.ckr.authsrv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/26.
 */

@SpringBootApplication
@Controller
public class AuthApplication {

    @RequestMapping(value = "/hello")
    @PreAuthorize(" hasPermission('hello', 'view') ")
    public void hello(HttpServletResponse response){
        try {
            response.getWriter().append("hello " + new Date(System.currentTimeMillis()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new SpringApplicationBuilder(AuthApplication.class)
                .properties("spring.config.name=auth_server").run(args);
    }

}
