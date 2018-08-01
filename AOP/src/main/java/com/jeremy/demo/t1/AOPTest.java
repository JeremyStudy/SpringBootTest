package com.jeremy.demo.t1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPTest {

    @Pointcut(value = "execution(void com.example.timechecker.t1..*.exec())")
    public void cut() {
    }

    @Before(value = "com.jeremy.demo.t1.AOPTest.cut()")
    public void beforeOne() {
        System.out.println("BeforeOne");
    }

    @Before(value = "com.jeremy.demo.t1.AOPTest.cut()")
    public void beforeTwo() {
        System.out.println("BeforeTwo");
    }

    @AfterReturning(value = "com.jeremy.demo.t1.AOPTest.cut()")
    public void afterOne() {
        System.out.println("AfterOne");
    }

    @Pointcut(
            value = "execution(void com.jeremy.demo.t1.Action.execParams(java.lang.String)) && args(params)",
            argNames = "params")
    public void withParams(String params) {
    }

    @Before(value = "withParams(params)", argNames = "params")
    public void beforeParamsOne(String params) {
        System.out.println("BeforeParamsOne");
        System.out.println("params=" + params);
    }

    @AfterThrowing(pointcut = "withParams(params)")
    public void afterThrows(String params) {
        System.out.println("AfterThrows");
    }

    @Pointcut(value = "execution(@com.jeremy.demo.t1.CPU * com.jeremy.demo.t1.Action.execAnnotation())")
    public void withAnnotation() {
    }

    @Before(value = "withAnnotation() && @annotation(cpu)")
    public void beforeAnnotationOne(JoinPoint joinPoint, CPU cpu) {
        System.out.println(cpu.type());
        System.out.println(cpu.price());
        System.out.println(joinPoint.getSignature().getName());
    }

    @Pointcut(value = "execution(void com.jeremy.demo.t1.Action.execAround())")
    public void onAround() {
    }

    @Around(value = "onAround()")
    public void defineAround(ProceedingJoinPoint joinPoint) {
        try {
            stepOne();
            stepTwo();
            joinPoint.proceed();
        } catch (Throwable throwable) {
            handleException(throwable);
        } finally {
            finalStep();
        }
    }

    private void stepOne() {
        System.out.println("Step One");
    }

    private void stepTwo() {
        System.out.println("Step Two");
    }

    private void handleException(Throwable t) {
        System.out.println("handle exception: " + t.getMessage());
    }

    private void finalStep() {
        System.out.println("final Step");
    }
}
