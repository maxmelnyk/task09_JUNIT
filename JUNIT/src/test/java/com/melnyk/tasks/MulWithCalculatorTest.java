package com.melnyk.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(Parameterized.class)
public class MulWithCalculatorTest {

  @InjectMocks
  Calculator tester;

  @Parameter()
  public double m1;
  @Parameter(1)
  public double m2;
  @Parameter(2)
  public double result;

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][]{{1, 5, 5}, {5, 10, 50}, {8, 3, 24}};
    return Arrays.asList(data);
  }

  @Test
  public void testMultiplyException() {
    CalculatorService calcService = Mockito.mock(CalculatorService.class);
    tester = new Calculator(calcService);
    when(calcService.mul(m1, m2)).thenReturn(result);
    assertEquals(tester.mul(m1, m2), result);
    System.out.println("Mul is correct");
  }
}
