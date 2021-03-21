package com.pearadmin.pro.common.aop;

import com.pearadmin.pro.common.aop.lang.annotation.BehaveLog;
import com.pearadmin.pro.common.aop.lang.enums.Action;
import com.pearadmin.pro.common.web.context.BaseContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * Describe: 系统日志实现
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@Aspect
public class BehaveLogAspect {

    /**
     * 基 础 上 下 文
     * */
    @Resource
    private BaseContext context;

    /**
     * 切 面 编 程
     * */
    @Pointcut("@annotation(com.pearadmin.pro.common.aop.lang.annotation.BehaveLog) || @within(com.pearadmin.pro.common.aop.lang.annotation.BehaveLog)")
    public void dsPointCut() { }

    /**
     * 处 理 系 统 日 志
     * */
    @Around("dsPointCut()")
    private Object around(ProceedingJoinPoint joinPoint) throws Throwable
    {
        Object result = null;

        // 注 解 解 析
        BehaveLog annotation = getAnnotation(joinPoint);
        String title = annotation.title();
        Action action = annotation.action();
        String describe = annotation.describe();

        try {

            // 执 行 方 法
            result = joinPoint.proceed();

            // 记 录 日 志
            context.record(title, describe,action, true, null,null);

        }catch (Exception e){

            e.printStackTrace();
            // 异 常 处 理
            context.record(title, describe,action, true, null, null);
        }
        return result;
    }

    /**
     * 获 取 注 解
     * */
    public BehaveLog getAnnotation(ProceedingJoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Class<? extends Object> targetClass = point.getTarget().getClass();
        BehaveLog targetBehaveLog = targetClass.getAnnotation(BehaveLog.class);
        if ( targetBehaveLog != null) {
            return targetBehaveLog;
        } else {
            Method method = signature.getMethod();
            BehaveLog behaveLog = method.getAnnotation(BehaveLog.class);
            return behaveLog;
        }
    }
}