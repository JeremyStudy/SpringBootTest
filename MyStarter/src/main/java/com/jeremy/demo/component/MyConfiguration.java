package com.jeremy.demo.component;

import com.jeremy.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <code>@Configuration</code>：标识此类为一个spring配置类<br>
 * <code>@EnableConfigurationProperties(value = HelloServiceProperteis.class)</code>:
 * &nbsp;&nbsp;启动配置文件，value用来指定我们要启用的配置类，可以有多个，多个时我们可以这么写value={xxProperties1.class,xxProperteis2.class....}<br>
 * <code>@ConditionalOnClass(HelloService.class)</code>:表示当classPath下存在HelloService.class文件时改配置文件类才有效<br>
 * <code>@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)</code>:
 * 表示只有我们的配置文件是否配置了以hello为前缀的资源项值，并且在该资源项值为enable，如果没有配置我们默认设置为enable
 */
@Configuration
@EnableConfigurationProperties(value = ServiceProperties.class)
@ConditionalOnClass(MyService.class)
@ConditionalOnProperty(prefix = "my", value = "enable", matchIfMissing = true)
public class MyConfiguration {

    @Autowired
    private ServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean(MyService.class)
    public MyService myService() {
        MyService service = new MyService();
        service.setMsg(properties.getMsg());
        return service;
    }
}
