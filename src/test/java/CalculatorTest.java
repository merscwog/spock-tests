import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
    Calculator calculator;    

    @Before
    public void setup() {
	calculator = new Calculator();
    }

    @Test
    public void testSimpleAddition() {
	assertEquals("2+2=4", 4, calculator.add(2,2));
    }
}
