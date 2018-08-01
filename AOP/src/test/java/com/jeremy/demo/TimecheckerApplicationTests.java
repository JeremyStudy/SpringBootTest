package com.jeremy.demo;

import com.jeremy.demo.t1.Action;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimecheckerApplicationTests {

    @Autowired
    Action action;

    @Test
    public void contextLoads(){

    }

    @Test
    public void aopTest() {
        action.exec();
    }

    @Test
    public void aopTestWithParams(){
        try {
            action.execParams("Jeremy");
        } catch (Exception e) {
            System.out.println("catch exception");
        }
    }

    @Test
    public void aopTestWithAnnotation(){
        action.execAnnotation();
    }

    @Test
    public void aopTestAround(){
        action.execAround();
    }
}
