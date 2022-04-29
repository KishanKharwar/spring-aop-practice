package com.aop.programmatic.approach.around.advice.main;

import com.aop.programmatic.approach.around.advice.advice.LoggingAdvice;
import com.aop.programmatic.approach.around.advice.beans.Calculator;
import org.springframework.aop.framework.ProxyFactory;

public class AroundAdviceTest {

  public static void main(String[] args) {
    ProxyFactory pf = new ProxyFactory();
    pf.setTarget(new Calculator());
    pf.addAdvice(new LoggingAdvice());

    Calculator proxy = (Calculator) pf.getProxy();
    int sum = proxy.add(10,20);
    System.out.println("Sum : "+sum);
  }
}
