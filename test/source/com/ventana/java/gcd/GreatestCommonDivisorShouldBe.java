package com.ventana.java.gcd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreatestCommonDivisorShouldBe {

  @Test
  public void oneWhenAnyFactorIs1() {
    assertThat("gcdOf(1, 99)", GreatestCommonDivisorMethod.gcdOf(1, 99), is(equalTo(1)));
    assertThat("gcdOf(199, 1)", GreatestCommonDivisorMethod.gcdOf(199, 1), is(equalTo(1)));
  }

  @Test
  public void theFactorWhenBothFactorsAreEqual() {
    assertThat("gcdOf(199, 199)", GreatestCommonDivisorMethod.gcdOf(199, 199), is(equalTo(199)));
  }

  @Test
  public void oneWhenFactorsAre2AndAnyOddNumber() throws Exception {
    assertThat("gcdOf(2, 101)", GreatestCommonDivisorMethod.gcdOf(2, 101), is(equalTo(1)));
    assertThat("gcdOf(1771, 2)", GreatestCommonDivisorMethod.gcdOf(1771, 2), is(equalTo(1)));
  }

  @Test
  public void twoWhenFactorsAre2And4() throws Exception {
    assertThat("gcdOf(2, 4)", GreatestCommonDivisorMethod.gcdOf(2, 4), is(equalTo(2)));
    assertThat("gcdOf(4, 2)", GreatestCommonDivisorMethod.gcdOf(4, 2), is(equalTo(2)));
  }

  @Test
  public void threeWhenFactorsAre3And9() throws Exception {
    assertThat("gcdOf(3, 9)", GreatestCommonDivisorMethod.gcdOf(3, 9), is(equalTo(3)));
    assertThat("gcdOf(9, 3)", GreatestCommonDivisorMethod.gcdOf(9, 3), is(equalTo(3)));
  }

  @Test
  public void twelveWhenFactorsAre12And144() throws Exception {
    assertThat("gcdOf(12, 144)", GreatestCommonDivisorMethod.gcdOf(12, 144), is(equalTo(12)));
    assertThat("gcdOf(144, 12)", GreatestCommonDivisorMethod.gcdOf(144, 12), is(equalTo(12)));
  }

  @Test
  public void threeWhenFactorsAre12And147() throws Exception {
    assertThat("gcdOf(12, 147)", GreatestCommonDivisorMethod.gcdOf(12, 147), is(equalTo(3)));
    assertThat("gcdOf(147, 12)", GreatestCommonDivisorMethod.gcdOf(147, 12), is(equalTo(3)));
  }

  @Test
  public void fourWhenFactorsAre12And148() throws Exception {
    assertThat("gcdOf(12, 148)", GreatestCommonDivisorMethod.gcdOf(12, 148), is(equalTo(4)));
    assertThat("gcdOf(148, 12)", GreatestCommonDivisorMethod.gcdOf(148, 12), is(equalTo(4)));
  }

  @Test
  public void sixWhenFactorsAre12And150() throws Exception {
    assertThat("gcdOf(12, 150)", GreatestCommonDivisorMethod.gcdOf(12, 150), is(equalTo(6)));
    assertThat("gcdOf(150, 12)", GreatestCommonDivisorMethod.gcdOf(150, 12), is(equalTo(6)));
  }
}
