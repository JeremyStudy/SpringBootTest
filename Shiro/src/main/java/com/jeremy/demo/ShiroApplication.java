package com.jeremy.demo;

import com.jeremy.demo.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShiroApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShiroApplication.class, args);

        MyService service = context.getBean(MyService.class);
        String msg = service.sayHello();
        System.out.println(msg);
        ((ConfigurableApplicationContext) context).close();
    }
}
