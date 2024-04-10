package Calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TrainTicketTest {
    TrainTicket tt = new TrainTicket(100,30);
    TrainTicket ttOver = new TrainTicket(100,90);
    TrainTicket ttUnder = new TrainTicket(100,10);

    @Test
    void TrainTicket(){
        //controllo eccezioni: numeri negativi
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new TrainTicket(-1,10));
        assertEquals("The value must be a positive numbers", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> new TrainTicket(10,-1));
        assertEquals("The field age is invalid", exception.getMessage());
        //controllo eccezioni: age troppo alto
        exception = assertThrows(IllegalArgumentException.class, () -> new TrainTicket(10,500));
        assertEquals("The field age is invalid", exception.getMessage());
    }

    @Test
    void calculateDiscount() {
        //controllo funzionamento base
        assertEquals(new BigDecimal("21.00"), tt.CalculateDiscount());
        assertEquals(new BigDecimal("12.60"), ttOver.CalculateDiscount());
        assertEquals(new BigDecimal("16.80"), ttUnder.CalculateDiscount());
    }
}