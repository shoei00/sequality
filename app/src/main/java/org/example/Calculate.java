package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public float average(int x, int y) {
    return (float) (x + y) / 2;
  }

  public int sumOddNumbers(int x, int y) {
    int sumOdd = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        sumOdd += i;
      }
    }
    return sumOdd;
  }

  public int sumEvenNumbers(int x, int y) {
    int sumEven = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      }
    }
    return sumEven;
  }

  public int sumNumbers(int x, int y) {
    int sumnum = 0;
    for (int i = x; i <= y; i++) {
      sumnum += i;
    }
    return sumnum;
  }

  public float averageNumbers(int x, int y) {
    int sumnum = 0;
    float ave;
    sumnum = this.sumNumbers(x, y);
    ave = (float) sumnum / (y - x + 1);
    return ave;
  }

}
