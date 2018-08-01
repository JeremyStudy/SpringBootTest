package com.jeremy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.threeten.bp.OffsetDateTime;

@SpringBootApplication
public class TimecheckerApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger("main");

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(TimecheckerApplication.class, args);
        MongoTemplate template = ac.getBean(MongoTemplate.class);
        LOGGER.info("payId = {}", args[0]);
        PayDto pay = template.findById(args[0], PayDto.class);
        OffsetDateTime time = pay.getPayTime();
        LOGGER.info("payTime = {}",time);
        LOGGER.info("now = {}", OffsetDateTime.now());

        ((ConfigurableApplicationContext) ac).close();
    }
}
