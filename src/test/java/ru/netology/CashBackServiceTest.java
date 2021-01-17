package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {
    @Test
    void shouldSummaLess1000() {
        CashBackService service=new CashBackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @Test
    void shouldSummaMore1000() {
        CashBackService service=new CashBackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual,expected);
    }

    @Test
    void shouldSummaEquals1000() {
        CashBackService service=new CashBackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

}