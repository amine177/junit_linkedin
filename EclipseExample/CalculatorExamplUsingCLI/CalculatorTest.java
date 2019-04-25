package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {
  @Test
  public void evaluateExpression() {
    Calculator calculator = new Calculator();
    int[] numbers = {1, 2, 3};
    int sum = calculator.evaluate(numbers);
    assertEquals(6, sum);
  }
}
