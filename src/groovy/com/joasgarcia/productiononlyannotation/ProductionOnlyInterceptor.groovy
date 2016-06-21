package com.joasgarcia.productiononlyannotation

import grails.util.Environment
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

@Aspect
class ProductionOnlyInterceptor {

    @Around("@annotation(com.joasgarcia.productiononlyannotation.ProductionOnly) && args(messageParameter)")
    def interceptAllMethodsWithProductionOnlyAnnotation(ProceedingJoinPoint joinPoint, String messageParameter) {
        if (!Environment.getCurrent().equals(Environment.PRODUCTION)) return "NOK"

        String changedParameter = "${messageParameter} - ${new Date()}"

        joinPoint.proceed([changedParameter] as Object[])
    }
}

