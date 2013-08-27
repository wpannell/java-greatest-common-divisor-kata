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

  @Test
  public void twelveWhenFactorsAre12And144() throws Exception {
    assertThat("gcdOf(12, 144)", gcdOf(12, 144), is(equalTo(12)));
    assertThat("gcdOf(144, 12)", gcdOf(144, 12), is(equalTo(12)));
  }

  @Test
  public void threeWhenFactorsAre12And147() throws Exception {
    assertThat("gcdOf(12, 147)", gcdOf(12, 147), is(equalTo(3)));
    assertThat("gcdOf(147, 12)", gcdOf(147, 12), is(equalTo(3)));
  }

  @Test
  public void fourWhenFactorsAre12And148() throws Exception {
    assertThat("gcdOf(12, 148)", gcdOf(12, 148), is(equalTo(4)));
    assertThat("gcdOf(148, 12)", gcdOf(148, 12), is(equalTo(4)));
  }

  @Test
  public void sixWhenFactorsAre12And150() throws Exception {
    assertThat("gcdOf(12, 150)", gcdOf(12, 150), is(equalTo(6)));
    assertThat("gcdOf(150, 12)", gcdOf(150, 12), is(equalTo(6)));
  }

}
