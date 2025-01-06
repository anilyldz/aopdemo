package com.anily.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Pointcut("execution(* com.anily.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdviceAccountDAOPackage() {
        System.out.println("\n ========>>> Executing @Before advice on AccountDAO package with Pointcut Annotation");
    }

    @After("forDaoPackage()")
    public void afterAddAccountAdviceAccountDAOPackage() {
        System.out.println("\n ========>>> Executing @After advice on AccountDAO package with Pointcut Annotation");
    }

    /*

    //Wildcard Expression
    @Before("execution(* add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n ========>>> Executing @Before advice on addAccount()");
    }

    //Parameter Expression
    @Before("execution(* add*(com.anily.aopdemo.Account))")
    public void beforeAddAccountAdviceParameterExp() {
        System.out.println("\n ========>>> Executing @Before advice on addAccount(Account)");
    }

    //Any Parameter Expression
    //@Before("execution(* add*(..))") everyone passes
    @Before("execution(* add*(com.anily.aopdemo.Account, ..))")
    public void beforeAddAccountAdviceAnyParameterExp() {
        System.out.println("\n ========>>> Executing @Before advice on addAccount(Account)");
    }

    //Package Expression
    @Before("execution(public void com.anily.aopdemo.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdviceAccountDAO() {
        System.out.println("\n ========>>> Executing @Before advice on AccountDAO addAccount()");
    }

    //Wildcard Package Expression return type + package + * + * + all number of parameters
    @Before("execution(* com.anily.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdviceAccountDAOPackage() {
        System.out.println("\n ========>>> Executing @Before advice on AccountDAO addAccount()");
    }

    //Return type Expression
    @Before("execution(void add*())")
    public void beforeAddAccountAdviceReturnType() {
        System.out.println("\n ========>>> Executing @Before advice on addAccount()");
    }

     */
}
