package com.anily.aopdemo.aspect;

import com.anily.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class DemoLoggingAspect {

    @Around("execution(* com.anily.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            String method = proceedingJoinPoint.getSignature().toString();
            System.out.println("\n=======>>> Executing @Around on method : " + method);
            Long begin = System.currentTimeMillis();
            Object result = proceedingJoinPoint.proceed();
            Long end = System.currentTimeMillis();
            Long duration = end - begin;
            System.out.println("\n=======>>> Duration : " + duration / 1000.0 + " seconds");
            return result;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /*
    @AfterThrowing(pointcut = "execution(* com.anily.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "exception")
    public void afterThrowingFindAccountAdvice(JoinPoint joinPoint, Throwable exception) {
        String method = joinPoint.getSignature().toString();
        System.out.println("\n=======>>> Executing @AfterThrowing on method : " + method);
        System.out.println("\n=======>>> Exception is : " + exception);
    }

    @AfterReturning(pointcut = "execution(* com.anily.aopdemo.dao.AccountDAO.findAccounts(..))",
                    returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result) {
        String method = joinPoint.getSignature().toString();
        System.out.println("\n=======>>> Executing @AfterReturning on method : " + method);
        System.out.println("\n=======>>> Result is : " + result);
        convertAccountNamesToUpperCase(result);
    }

    private void convertAccountNamesToUpperCase(List<Account> result) {
        for (Account account : result){
            account.setName(account.getName().toUpperCase());
        }
    }

    @Before("com.anily.aopdemo.aspect.AopExpressionsUtil.beforeAddAccountAdviceNoGetterSetter()")
    public void beforeAddAccountAdviceAccountDAOPackage(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println(arg);
            if (arg instanceof Account) {
                Account account = (Account) arg;
                System.out.println("Account name: " + account.getName());
                System.out.println("Account level: " + account.getLevel());
            }
        }

        System.out.println("\n ========>>> Executing @Before advice on DemoLoggingAspect \n");
    }

    @After("forDaoPackage()")
    public void afterAddAccountAdviceAccountDAOPackage() {
        System.out.println("\n ========>>> Executing @After advice on AccountDAO package with Pointcut Annotation \n");
    }

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
