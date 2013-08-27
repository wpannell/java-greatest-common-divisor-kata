package com.ventana.java.gcd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorShouldBe {
  private int gcdOf(int... factors) {
    if(factors[0] == 1 || factors[1] == 1) return 1;
    if(factors[0] == factors[1]) return factors[0];
    if(factors[1] % factors[0] == 0) return factors[0];
    return gcdOf(factors[1] % factors[0], factors[0]);
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

  @Test
  public void oneWhenFactorsAre2AndAnyOddNumber() throws Exception {
    assertThat("gcdOf(2, 101)", gcdOf(2, 101), is(equalTo(1)));
    assertThat("gcdOf(1771, 2)", gcdOf(1771, 2), is(equalTo(1)));
  }

  @Test
  public void twoWhenFactorsAre2And4() throws Exception {
    assertThat("gcdOf(2, 4)", gcdOf(2, 4), is(equalTo(2)));
    assertThat("gcdOf(4, 2)", gcdOf(4, 2), is(equalTo(2)));
  }

  @Test
  public void threeWhenFactorsAre3And9() throws Exception {
    assertThat("gcdOf(3, 9)", gcdOf(3, 9), is(equalTo(3)));
    assertThat("gcdOf(9, 3)", gcdOf(9, 3), is(equalTo(3)));
  }
}
