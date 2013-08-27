package com.ventana.java.gcd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorShouldBe {
  private int gcdOf(int... factors) {
    return 0;
  }

  @Test
  public void oneWhenFactorsAre1And1() {
    assertThat("gcdOf(1, 1)", gcdOf(1, 1), is(equalTo(1)));
  }
}
