package Calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class CalculatorTest {
    float n1 = 10;
    float n2 = 5;
    @Test
    void add() {
        assertEquals(15,Calculator.add(n1,n2));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(-1,n2));
        assertEquals("The values must be a positive numbers", exception.getMessage());
    }

    @Test
    void subtract() {
        assertEquals(5, Calculator.subtract(n1, n2));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(-1,n2));
        assertEquals("The values must be a positive numbers", exception.getMessage());
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(n1, n2));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1,n2));
        assertEquals("The values must be a positive numbers", exception.getMessage());
        ArithmeticException ArithmeticException = assertThrows(ArithmeticException.class, () -> Calculator.divide(n1,0));
        assertEquals("division by 0 is impossible", ArithmeticException.getMessage());
    }

    @Test
    void multiply() {
        assertEquals(50, Calculator.multiply(n1, n2));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(-1,n2));
        assertEquals("The values must be a positive numbers", exception.getMessage());
    }
}