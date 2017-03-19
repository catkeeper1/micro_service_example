package com.ckr.authsrv.config;

import com.ckr.authsrv.security.CustomizedAuthenticationEntryPoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId("RESOURCE_ID").stateless(false);
        resources.authenticationEntryPoint(new CustomizedAuthenticationEntryPoint());
        //resources.authenticationManager()
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
        .and()
            .authorizeRequests()
            .antMatchers("/hello").access("#oauth2.hasScope('read')")
        .and()
            .authorizeRequests()
            .antMatchers("/hello1").access("#oauth2.hasScope('read')")
        .and()
            .authorizeRequests()
            .anyRequest()
            .permitAll();



    }

}
