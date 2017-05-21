package com.ckr.maintenance;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2017/5/21.
 */
@SpringBootApplication()
public class MaintenanceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(MaintenanceApplication.class)
                .properties("spring.config.name=maintenance_service").run(args);
    }
}
