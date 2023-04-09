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
    @Test
    void Date(){
         Date d1 = new Date(5,2,2017);
         Date d2 = new Date(2017);
         assertEquals(2017,d1.chAnnee);
         assertEquals(2,d1.chMois);
         assertEquals(5,d1.chJour);
         assertEquals(2017,d2.chAnnee);
         assertEquals(1,d2.chMois);
         assertEquals(1,d2.chJour);
    }
     @Test
    void dateDuLendemain(){
        Date d1 = new Date(31,1,2020);
        Date d2 = new Date(20,1,2020);
        Date d3 = new Date(25,12,2020);
        Date d4 = new Date(31,12,2020);

        assertEquals(1,d1.dateDuLendemain().chJour);
        assertEquals(2,d1.dateDuLendemain().chMois);
        assertEquals(2020,d1.dateDuLendemain().chAnnee);

        assertEquals(21,d2.dateDuLendemain().chJour);
        assertEquals(1,d2.dateDuLendemain().chMois);
        assertEquals(2020,d2.dateDuLendemain().chAnnee);

        assertEquals(26,d3.dateDuLendemain().chJour);
        assertEquals(12,d3.dateDuLendemain().chMois);
        assertEquals(2020,d3.dateDuLendemain().chAnnee);

        assertEquals(1,d4.dateDuLendemain().chJour);
        assertEquals(1,d4.dateDuLendemain().chMois);
        assertEquals(2021,d4.dateDuLendemain().chAnnee);
    }
    
    @Test
    void dateDeLaVeille() {
        Date d1 = new Date(1,1,2020);
        Date d2 = new Date(1,2,2020);
        Date d3 = new Date(25,1,2020);
        Date d4 = new Date(25,2,2020);

        assertEquals(31,d1.dateDeLaVeille().chJour);
        assertEquals(12,d1.dateDeLaVeille().chMois);
        assertEquals(2019,d1.dateDeLaVeille().chAnnee);

        assertEquals(31,d2.dateDeLaVeille().chJour);
        assertEquals(1,d2.dateDeLaVeille().chMois);
        assertEquals(2020,d2.dateDeLaVeille().chAnnee);

        assertEquals(24,d3.dateDeLaVeille().chJour);
        assertEquals(1,d3.dateDeLaVeille().chMois);
        assertEquals(2020,d3.dateDeLaVeille().chAnnee);

        assertEquals(24,d4.dateDeLaVeille().chJour);
        assertEquals(2,d4.dateDeLaVeille().chMois);
        assertEquals(2020,d4.dateDeLaVeille().chAnnee);

    }
}
