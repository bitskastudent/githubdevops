package test.java.com.myapp.calculatorapp;
import main.java.com.myapp.calculatorapp.SimpleCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    SimpleCalculator app = new SimpleCalculator();
    @Test
    public void testAddition() {
        double a = 1, b = 1;
        assertEquals(2.0, app.addition(a,b));
    }

    @Test
    public void testSubtraction() {
        // SimpleCalculator app = new SimpleCalculator();
        double a = 1, b = 1;
        assertEquals(0.0, app.subtraction(a,b));
    }

    @Test
    public void testMultiplication() {
        // SimpleCalculator app = new SimpleCalculator();
        double a = 2, b = 1;
        assertEquals(2.0, app.multiplication(a,b));
    }

    @Test
    public void testDivision1() {
        // SimpleCalculator app = new SimpleCalculator();
        double a = 1, b = 1;
        assertEquals("1.0", app.division(a,b));
    }

    @Test
    public void testDivision2() {
        // SimpleCalculator app = new SimpleCalculator();
        double a = 1, b = 0;
        assertEquals("Division by zero not possible", app.division(a,b));
    }
}
