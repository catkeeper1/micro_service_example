package com.ckr.portal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Administrator on 2017/3/19.
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest()
                .permitAll();


    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        //should be replaced by a real authentication(such as ldap) approach later here.
        auth.inMemoryAuthentication()
                .withUser("userA")
                .password("passwordA").roles("roleA")
                .and()
                .withUser("userB").password("passwordB").roles("roleB");

    }
}