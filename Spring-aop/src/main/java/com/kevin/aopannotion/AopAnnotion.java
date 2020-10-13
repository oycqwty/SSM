package com.kevin.aopannotion;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2020/10/3
 */
@Aspect
@Component
public class AopAnnotion {

    @Before("execution(public * testAnnotion(..))")
    public void Before() {
        System.out.println("执行注解前置通知");
    }

    @AfterReturning(value = "execution(public void com.kevin.dao.StudentDaoImpl.testAnnotion())", returning = "returnValue")
//    @AfterReturning("execution(* com.kevin.dao.*.*(..))")
    public void after() {
        System.out.println("执行后置");
    }

//    @AfterReturning(pointcut = "execution(public String com.kevin.dao.StudentDaoImpl.testAnnotionReturning())",
//            returning = "retuvalue")
//    public void after1(JoinPoint joinPoint,Object retuvalue){
//        System.out.println("参数个数:"+joinPoint.getArgs().length);
//        System.out.println("代理对象"+joinPoint.getThis());
//        System.out.println("签名对象"+joinPoint.getSignature());
//        System.out.println("返回值:"+retuvalue);
//    }

    @Around(value = "execution(public void com.kevin.dao.StudentDaoImpl.testThrow())")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("执行异常环绕通知之前");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            System.out.println("执行异常环绕通知之后");
        } catch (Throwable throwable) {
            System.out.println("环绕通知异常通知:" + throwable.getMessage());
        } finally {
            System.out.println("最终通知");
        }
    }

    @AfterThrowing(value = "execution(public void com.kevin.dao.StudentDaoImpl.testAround())", throwing = "e")
    public void thorw(Exception e) {
        try {
            System.out.println("执行异常通知");
            System.out.println(e.getMessage());
        } catch (Exception exception) {

        }
    }
}
