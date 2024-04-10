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
        //controllo eccezioni: numero negativo
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(-1,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(n1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(-1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero nullo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.NaN,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(n1,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.NaN,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito positivo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.POSITIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(n1,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito negativo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.NEGATIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(n1,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.add(Float.NEGATIVE_INFINITY,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
    }

    @Test
    void subtract() {
        //controllo funzionamento base
        assertEquals(5, Calculator.subtract(n1, n2));
        //controllo eccezioni: numero negativo
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(-1,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(n1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(-1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero nullo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.NaN,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(n1,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.NaN,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito positivo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.POSITIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(n1,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito negativo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.NEGATIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(n1,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(Float.NEGATIVE_INFINITY,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
    }

    @Test
    void divide() {
        //controllo funzionamento base
        assertEquals(2, Calculator.divide(n1, n2));
        //controllo eccezioni: numero negativo
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(n1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero nullo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.NaN,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(n1,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.NaN,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito positivo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.POSITIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(n1,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito negativo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.NEGATIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(n1,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(Float.NEGATIVE_INFINITY,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: divisore uguale a 0
        ArithmeticException ArithmeticException = assertThrows(ArithmeticException.class, () -> Calculator.divide(n1,0));
        assertEquals("division by 0 is impossible", ArithmeticException.getMessage());
    }

    @Test
    void multiply() {
        //controllo funzionamento base
        assertEquals(50, Calculator.multiply(n1, n2));
        //controllo eccezioni: numero negativo
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(-1,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(n1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(-1,-1));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero nullo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.NaN,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(n1,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.NaN,Float.NaN));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito positivo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.POSITIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(n1,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        //controllo eccezioni: numero infinito negativo
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.NEGATIVE_INFINITY,n2));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(n1,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(Float.NEGATIVE_INFINITY,Float.NEGATIVE_INFINITY));
        assertEquals("The values must be a finite positive numbers", exception.getMessage());
    }
}