package com.jeremy.demo.component;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <code>@ConfigurationProperties</code> 用来标识这个pojo是一个用来接收指定前缀的资源配置值,
 * prefix：表示在配置文件中配置项前缀
 */
@ConfigurationProperties(prefix = "my")
public class ServiceProperties {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
