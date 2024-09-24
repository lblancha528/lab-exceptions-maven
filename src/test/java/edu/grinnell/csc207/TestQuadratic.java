package edu.grinnell.csc207;

import edu.grinnell.csc207.util.Quadratic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the Quadratic class.
 *
 * @author Samuel A. Rebelsky
 * @author Lily Blanchard
 * @author Sal Karki
 */
public class TestQuadratic {
  /**
   * Quadratic expressions with only the a coefficient.
   */
  @Test
  public void testRootsOnlyA() {
    assertEquals(0, (new Quadratic(4, 0, 0)).smallerRoot(), 0.001,
        "The smaller root of 4x^2 is 0");
    assertEquals(0, (new Quadratic(4, 0, 0)).largerRoot(), 0.001,
        "The larger root of 4x^2 is 0");
  } // testRootsOnlyA()

  /**
   * Quadratic expressions with only the a and b coefficients.
   */
  @Test
  public void testRootsNoC() {
    assertEquals(0, (new Quadratic(1, -3, 0)).smallerRoot(), 0.001,
        "The smaller root of x^2 - 3x is 0");
  } // testRootsNoC()

/**
 * Some tests for smallerRoot()
 */
  @Test 
  public void smallerRootTests() {
    Quadratic a = new Quadratic(1, 0, 0);
    Quadratic b = new Quadratic(1, 2, -3);
    Quadratic c = new Quadratic(1, 3, -10);
    Quadratic d = new Quadratic(1, 5, 6);
    assertEquals(0, a.smallerRoot(), "zero root");
    assertEquals(-3, b.smallerRoot(), "negative root");
    assertEquals(-3, d.smallerRoot(), "two negative roots");
    assertEquals(-5, c.smallerRoot(), "another test");
  } // smallerRootTests()

} // class TestQuadratic
