import classes.Calculator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}



    @Test
    public void canAdd(){
        int result = calculator.add(1,3);
        assertEquals(4,result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(3,1);
        assertEquals(2,result);
    }

    @Test
    public void canMultiply(){
        int result = calculator.multiply(3,2);
        assertEquals(6,result);
    }

    @Test
    public void canDivide(){
        double result = calculator.divide(4,2);
        assertEquals(2.0,result);
    }
}
