package com.melnyk.tasks;

public class Calculator {

  private CalculatorService calculatorService;

  public Calculator() {
  }

  public Calculator(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  public void setCalculatorService(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  public double add(double a, double b) {
    return calculatorService.add(a, b);
  }

  public double sub(double a, double b) {
    return calculatorService.sub(a, b);
  }

  public double mul(double a, double b) {
    return /*calculatorService.mul(a, b)*/a*b;
  }

  public double div(double a, double b) {
    return calculatorService.div(a, b);
  }
}
