package com.example.demo.aspect;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Created by zuzhaoyue on 17/9/12.
 */
@Aspect
@Component
public class HttpAspect {
    private final Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    @Pointcut("execution(public * com.example.demo.controller.PersonController.insertPerson(..))")
    public void log(){
//        System.out.println("1111");
    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
//        System.out.println("00000");
        logger.info("22222");
        //url,method,ip,类方法,参数,
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) attributes.getRequest();
        logger.info("url={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("ip={}",request.getRemoteAddr());
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"." + joinPoint.getSignature().getName());
        logger.info("args={}",joinPoint.getArgs());

    }
    @After("log()")
    public void doAfter(){
        logger.info("3333");
    }
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("doAfterReturning"+object.toString());
    }

}
