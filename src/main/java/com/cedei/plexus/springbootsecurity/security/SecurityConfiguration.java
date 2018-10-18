package com.cedei.plexus.springbootsecurity.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserDetails user = User.withUsername("suso").password("{noop}suso").roles("user").build();
        UserDetails admin = User.withUsername("admin").password("{noop}admin").roles("admin").build();
        auth.inMemoryAuthentication().withUser(user).withUser(admin);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Este metodo es solo para autenticacion
        // http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
        
        // Este metodo sirve para autenticacion y autorizacion
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}