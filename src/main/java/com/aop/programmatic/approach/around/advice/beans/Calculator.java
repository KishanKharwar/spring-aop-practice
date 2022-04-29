package com.aop.programmatic.approach.around.advice.beans;

public class Calculator {
  public int add(int a, int b){
    int sum = 0;
    sum = a + b;
    return sum;
  }
}
