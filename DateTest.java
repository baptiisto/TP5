import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
   void dernierJourDuMois() {
        assertEquals(31,Date.dernierJourDuMois(1,2017));
        assertEquals(30,Date.dernierJourDuMois(4,2017));
        assertEquals(28,Date.dernierJourDuMois(2,2017));
        assertEquals(31,Date.dernierJourDuMois(1,2016));
        assertEquals(30,Date.dernierJourDuMois(4,2016));
        assertEquals(29,Date.dernierJourDuMois(2,2016));
        assertEquals(-1,Date.dernierJourDuMois(13,2100));
    }


    @Test
    void estBissextile() {
        assertTrue(Date.estBissextile(2400));
        assertTrue(Date.estBissextile(2016));
        assertFalse(Date.estBissextile(2100));
        assertFalse(Date.estBissextile(2017));

    }
}
