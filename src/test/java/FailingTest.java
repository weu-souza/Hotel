import org.junit.Test;


import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class FailingTest {
    @Test
    public void test1() {
        HotelReservation Hotel = new HotelReservation();
         assertEquals("Lakewood", Hotel.getCheapestHotel("regular", LocalDate.of(2009, Month.MARCH,16),
                LocalDate.of(2009, Month.MARCH,17),LocalDate.of(2009, Month.MARCH,18)));

    }
    @Test
    public void test2() {
        HotelReservation Hotel = new HotelReservation();
        assertEquals("Bridgewood", Hotel.getCheapestHotel("Regular",LocalDate.of(2009, Month.MARCH,20),
                LocalDate.of(2009, Month.MARCH,21),LocalDate.of(2009, Month.MARCH,22)));
    }
    @Test
    public void test3() {
        HotelReservation Hotel = new HotelReservation();
        assertEquals("Ridgewood", Hotel.getCheapestHotel("Rewards",LocalDate.of(2009, Month.MARCH,26),
                LocalDate.of(2009, Month.MARCH,27),LocalDate.of(2009, Month.MARCH,28)));
    }

}
