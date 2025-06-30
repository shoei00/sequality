package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    float expected = 2.5f;
    assertEquals(expected, calculate.average(2, 3), 0.01);
  }

  @Test
  public void testSumOddNumber() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOddNumbers(1, 10));
  }

  @Test
  public void testSumEvenNumber() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEvenNumbers(1, 10));
  }

  @Test
  public void testSumNumber() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumNumbers(1, 10));
  }

  @Test
  public void testAverageNumber() {
    Calculate calculate = new Calculate();
    float expected = 5.5f;
    assertEquals(expected, calculate.averageNumbers(1, 10), 0.01);
  }
}
