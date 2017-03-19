package com.ckr.portal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Administrator on 2017/3/19.
 */
@SpringBootApplication
public class PortalApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(PortalApplication.class)
                .properties("spring.config.name=portal_server").run(args);
    }
}
