package com.ventana.java.gcd;

public class Main {
  public static void main(String[] args) {
    if(args.length != 2) {
      System.out.println(
          "incorrect number of arguments -- commandline usage (e.g.): gcd 2 4");
      return;
    }
    int dividend = 0;
    int divisor = 0;
    try {
      dividend = Integer.parseInt(args[0]);
      divisor = Integer.parseInt(args[1]);
    }
    catch (Exception e) {
      System.out.println(args[0] + " or " + args[1] + " not a number");
    }
    System.out.println(
        new GreatestCommonDivisorMethod().gcdOf(dividend, divisor));
  }
}
