package com.aop.programmatic.approach.around.advice.advice;

import com.aop.programmatic.approach.around.advice.beans.Calculator;
import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    String methodName = null;
    Method method = null;
    Object arr[] = null;
    Object calculator = null;

    methodName = invocation.getMethod().getName();
    System.out.print("Entring into " + methodName + "(");
    arr = invocation.getArguments();
    for(int i =0;i<arr.length;i++){
      if(i == 0){
        System.out.print(arr[i]);
        continue;
      }
      System.out.print("," + arr[i]);
    }
    System.out.print(")");
    System.out.println();

    calculator = invocation.getThis();
    Object ret = invocation.proceed();

    System.out.println("Exiting from " + methodName + " with return value : " + ret);
    return ret;
  }
}
