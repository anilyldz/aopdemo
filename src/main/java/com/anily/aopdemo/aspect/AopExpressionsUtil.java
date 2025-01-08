package com.anily.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//If only have pointcuts then @Aspect is optional
@Aspect
public class AopExpressionsUtil {

    @Pointcut("execution(* com.anily.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    //Pointcut for getters
    @Pointcut("execution(* com.anily.aopdemo.dao.*.get*(..))")
    public void getter(){}

    //Pointcut for setters
    @Pointcut("execution(* com.anily.aopdemo.dao.*.set*(..))")
    public void setter(){}

    //Excluding getter and setter pointcut expressions
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void beforeAddAccountAdviceNoGetterSetter() {}

}
