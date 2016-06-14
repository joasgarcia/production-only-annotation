package com.joasgarcia.productiononlyannotation

import grails.util.Environment
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

@Aspect
class ProductionOnlyInterceptor {

    @Around("@annotation(com.joasgarcia.productiononlyannotation.ProductionOnly)")
    def foo(ProceedingJoinPoint joinPoint) {
        if (!Environment.getCurrent().equals(Environment.PRODUCTION)) return "NOK"

        joinPoint.proceed()
    }
}

