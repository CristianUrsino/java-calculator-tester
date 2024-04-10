package Calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class CalculatorTest {
    float n1 = 10;
    float n2 = 5;
    @Test
    void add() {
        //controllo funzionamento base
        assertEquals(15,Calculator.add(n1,n2));
    }

    @Test
    void subtract() {
        //controllo funzionamento base
        assertEquals(5, Calculator.subtract(n1, n2));
    }

    @Test
    void divide() {
        //controllo funzionamento base
        assertEquals(2, Calculator.divide(n1, n2));
        //controllo eccezioni: divisore uguale a 0
        ArithmeticException ArithmeticException = assertThrows(ArithmeticException.class, () -> Calculator.divide(n1,0));
        assertEquals("division by 0 is impossible", ArithmeticException.getMessage());
    }

    @Test
    void multiply() {
        //controllo funzionamento base
        assertEquals(50, Calculator.multiply(n1, n2));
    }

    @Test
    void validateFloat(){
        //controllo eccezioni: numero negativo
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.validateFloat(-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero nullo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.validateFloat(Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito positivo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.validateFloat(Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito negativo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.validateFloat(Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
    }
}