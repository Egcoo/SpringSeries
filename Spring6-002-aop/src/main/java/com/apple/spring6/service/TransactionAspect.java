package com.apple.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Egcoo
 * @date 2023/6/22 - 11:26
 */
@Component
@Aspect
public class TransactionAspect {

    /**
     * 事务的环绕方法, 编程式事务解决方案
     */
    @Around("execution(* com.apple.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        try {
            // 前环绕
            System.out.println("开启事务");
            joinPoint.proceed();
            // 后环绕
            System.out.println("提交事务");
        } catch (Throwable throwable) {
            // 异常
            System.out.println("事务回滚");
            throwable.printStackTrace();
        }
    }
}
