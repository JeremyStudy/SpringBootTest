package com.jeremy.demo.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);

    public void run(){

        Subject subject = SecurityUtils.getSubject();
    }
}
