package com.jeremy.demo.config;

import com.jeremy.demo.shiro.UserRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserRealm getUserRealm() {
        return new UserRealm();
    }
}
