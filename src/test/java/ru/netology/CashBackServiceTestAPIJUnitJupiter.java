package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashBackServiceTestAPIJUnitJupiter {
    @Test
    public void shouldSummaLess1000() {
        CashBackService service=new CashBackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSummaMore1000() {
        CashBackService service=new CashBackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldSummaEquals1000() {
        CashBackService service=new CashBackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);
    }

}