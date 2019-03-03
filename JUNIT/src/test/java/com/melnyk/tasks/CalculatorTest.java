package com.melnyk.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

  @InjectMocks
  Calculator tester;

  @Mock
  CalculatorService calculatorService;

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator(calculatorService);
    when(calculatorService.add(15,45)).thenReturn(60.0);
    assertEquals(60.0, calculator.add(15,45), 0.00001);
    System.out.println("Add is correct!");
  }

  @Test
  public void testSub() {
    when(calculatorService.sub(18, 6)).thenReturn(12.0);
    assertEquals(tester.sub(18, 6), 12.0);
    verify(calculatorService).sub(18,6);
    System.out.println("Sub is correct!");
  }

  @Test
  @Disabled
  public void testDiv() {
    when(calculatorService.div(48, 6)).thenReturn(8.0);
    assertEquals(calculatorService.div(48, 6), 8.0);
    System.out.println("Div is correct");
  }
}
