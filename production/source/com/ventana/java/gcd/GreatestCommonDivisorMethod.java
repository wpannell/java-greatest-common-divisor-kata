package com.ventana.java.gcd;

public class GreatestCommonDivisorMethod {
  public int gcdOf(int dividend, int divisor) {
    if(dividend % divisor == 0) return divisor;
    return gcdOf(divisor, dividend % divisor);
  }
}
