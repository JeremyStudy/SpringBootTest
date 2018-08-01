package com.jeremy.demo.t1;

import org.springframework.stereotype.Component;

@Component
public class Action {

    public void exec(){
        System.out.println("执行动作");
    }

    public void execParams(String params) {
        System.out.println("Execute with parameters!");
        throw new IllegalArgumentException("Error has been Occurred!");
    }

    @CPU(type = "I7 5800", price = 800D)
    public void execAnnotation(){
        System.out.println("CPU Sales");
    }

    public void execAround(){
        System.out.println("exec around");
    }

}
