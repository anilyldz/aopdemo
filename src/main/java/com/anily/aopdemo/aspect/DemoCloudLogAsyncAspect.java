package com.anily.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoCloudLogAsyncAspect {

    @Before("com.anily.aopdemo.aspect.AopExpressionsUtil.beforeAddAccountAdviceNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n ========>>> Executing @Before advice on DemoCloudLogAsyncAspect \n");
    }

}
