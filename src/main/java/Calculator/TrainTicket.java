package Calculator;

import java.math.BigDecimal;

public class TrainTicket {
    //ATTRIBUTI
    final BigDecimal PRICE_PER_KM = new BigDecimal("0.21");
    final int UNDER_AGE = 18;
    final int OVER_AGE = 65;
    final int OVER_DISCOUNT = 40;
    final int UNDER_DISCOUNT = 20;
    int kilometresTravel;
    int age;
    //COSTRUTTORE
    public TrainTicket(int kilometresTravel, int age)
            throws IllegalArgumentException{
        validatePositiveIntegers(kilometresTravel);
        validateAge(age);
        if(age > 120){
            throw new IllegalArgumentException("The field age is too large");
        }
        this.kilometresTravel = kilometresTravel;
        this.age = age;
    }
    //METODI
    //validazioni
    private void validatePositiveIntegers(int n)
            throws IllegalArgumentException {
        if (n < 1) {
            throw new IllegalArgumentException("Il valore deve essere un numero intero positivo finito.");
        }
    }
    private void validateAge(int n)
            throws IllegalArgumentException{
        if(n > 120 || n < 1){
            throw new IllegalArgumentException("The field age is invalid");
        }
    }
    //setter e getter
    public int getKilometresTravel() {
        return kilometresTravel;
    }
    public void setKilometresTravel(int kilometresTravel)
            throws IllegalArgumentException{
        validatePositiveIntegers(kilometresTravel);
        this.kilometresTravel = kilometresTravel;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age)
            throws IllegalArgumentException{
        validateAge(age);
        this.age = age;
    }
    public BigDecimal getPRICE_PER_KM() {
        return PRICE_PER_KM;
    }
    public int getUNDER_AGE() {
        return UNDER_AGE;
    }
    public int getOVER_AGE() {
        return OVER_AGE;
    }
    //altri metodi
    public BigDecimal CalculateDiscount(){
        BigDecimal price = PRICE_PER_KM.multiply(new BigDecimal(kilometresTravel));
        if(age >= OVER_AGE){
            return price.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(OVER_DISCOUNT).divide(BigDecimal.valueOf(100)))).setScale(2);
        }else if(age <= UNDER_AGE){
            return price.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(UNDER_DISCOUNT).divide(BigDecimal.valueOf(100)))).setScale(2);
        }else{
            return price.setScale(2);
        }
    }
}
