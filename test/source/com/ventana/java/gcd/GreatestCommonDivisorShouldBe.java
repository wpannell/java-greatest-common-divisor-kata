package com.ventana.java.gcd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorShouldBe {
  private int gcdOf(int... factors) {
    return 1;
  }

  @Test
  public void oneWhenAnyFactorIs1() {
    assertThat("gcdOf(1, 99)", gcdOf(1, 99), is(equalTo(1)));
    assertThat("gcdOf(199, 1)", gcdOf(199, 1), is(equalTo(1)));
  }

  @Test
  public void theFactorWhenBothFactorsAreEqual() {
    assertThat("gcdOf(199, 199)", gcdOf(199, 199), is(equalTo(199)));
  }

}
