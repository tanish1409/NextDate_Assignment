import org.example.NextDate;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertEquals;

public class NextDateTest {
    @Test
    @Category(ValidDate.class)
    public void testValidDayIncrement() {
        assertEquals("2/1/1812", NextDate.getNextDate(1, 1, 1812));
    }
    @Test
    @Category(ValidDate.class)
    public void testValidDayAndMonthIncrement() {
        assertEquals("1/2/1921", NextDate.getNextDate(31, 1, 1921));
    }

    @Test
    @Category(ValidDate.class)
    public void testValidDayMonthAndYearIncrement() {
        assertEquals("1/1/1832", NextDate.getNextDate(31, 12, 1831));
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(InvalidDate.class)
    public void testInvalidDateOutOfBounds() {
        NextDate.getNextDate(0, 3, 1821);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(InvalidDate.class)
    public void testInvalidMonthOutOfBounds() {
        NextDate.getNextDate(3, 19, 2002);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(InvalidDate.class)
    public void testInvalidYearOutOfBounds() {
        NextDate.getNextDate(2, 12, 2887);
    }

    @Test
    @Category(LeapYear.class)
    public void testValidDayAndMonthIncrementLeapYear() {
        assertEquals("1/3/2024", NextDate.getNextDate(29, 2, 2024));
    }

    @Test
    @Category(LeapYear.class)
    public void testValidDayAndMonthIncrementNonLeapYear() {
        assertEquals("1/3/2021", NextDate.getNextDate(28, 2, 2021));
    }
}

