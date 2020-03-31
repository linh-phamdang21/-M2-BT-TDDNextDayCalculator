import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDayDisplayTest1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "Next day: " + 2 + "/" + 1 + "/" + 2018;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDayDisplayTest2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "Next day: " + 1 + "/" + 2 + "/" + 2018;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDayDisplayTest3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "Next day: " + 1 + "/" + 5 + "/" + 2018;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDayDisplayTest4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "Next day: " + 1 + "/" + 3 + "/" + 2018;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDayDisplayTest5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "Next day: " + 1 + "/" + 3 + "/" + 2020;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void nextDayDisplayTest6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "Next day: " + 1 + "/" + 1 + "/" + 2019;
        String result = NextDayCalculator.nextDayDisplay(day,month,year);
        assertEquals(expected,result);
    }
}