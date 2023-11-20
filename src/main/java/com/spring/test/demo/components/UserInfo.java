package com.spring.test.demo.components;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

@Component
public class UserInfo {

    @Bean
    private PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.withUsername("sai").password(passwordEncoder().encode("test")).roles("admin").build();
        UserDetails user = User.withUsername("test").password(passwordEncoder().encode("test")).roles("user").build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}
