package dev.hugo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MonthInfoTest {

    @Test
    public void testGetMonthName() {
        assertEquals("January", MonthInfo.getMonthName(1));
        assertEquals("February", MonthInfo.getMonthName(2));
        assertEquals("Invalid month", MonthInfo.getMonthName(13));
    }

    @Test
    public void testGetDaysInMonth() {
        assertEquals(31, MonthInfo.getDaysInMonth(1, true));
        assertEquals(28, MonthInfo.getDaysInMonth(2, false));
        assertEquals(29, MonthInfo.getDaysInMonth(2, true));
        assertEquals(30, MonthInfo.getDaysInMonth(4, false));
        assertEquals(-1, MonthInfo.getDaysInMonth(13, false));
    }
}

