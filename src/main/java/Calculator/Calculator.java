package Calculator;

public class Calculator {
    //ATTRIBUTI
    //COSTRUTTORE
    private Calculator(){};
    //METODI
    //validazioni
    static void validateFloat(float f)
            throws IllegalArgumentException{
        if(f < 0 || Float.isNaN(f) || Float.isInfinite(f)){
            throw new IllegalArgumentException("The values must be a finite positive numbers");
        }
        float maxFloat = Float.MAX_VALUE;
        if(f > maxFloat){
            throw new IllegalArgumentException("The value is too large");
        }
    }
    static public float add(float num1, float num2)
            throws IllegalArgumentException{
        validateFloat(num1);
        validateFloat(num2);
        return num1 + num2;
    }
    static public float subtract(float num1, float num2)
            throws IllegalArgumentException{
        validateFloat(num1);
        validateFloat(num2);
        return num1 - num2;
    }static public float divide(float num1, float num2)
            throws IllegalArgumentException, ArithmeticException{
        validateFloat(num1);
        validateFloat(num2);
        if(num2 == 0){
            throw new ArithmeticException("division by 0 is impossible");
        }
        return num1 / num2;
    }static public float multiply(float num1, float num2)
            throws IllegalArgumentException{
        validateFloat(num1);
        validateFloat(num2);
        return num1 * num2;
    }
}
