package com.jeremy.demo.config;

import com.jeremy.demo.shiro.UserRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserRealm getUserRealm() {
        JdbcRealm realm = new JdbcRealm();
        return new UserRealm();
    }

}
