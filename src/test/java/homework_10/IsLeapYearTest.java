package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Високосный год: 2020 -> true
     * - Год делится на 400: 2000 -> true, 1600 -> true
     * Негативные кейсы:
     * - Обычный год: 2019 -> false, 2021 -> false, 2022 -> false
     * - Год делится на 100, но не на 400: 1900 -> false, 2100 -> false
     * Corner cases:
     * - 0 -> true
     * - 4 -> true
     * - 400 -> true
     */

    @ParameterizedTest(name = "Кейс {index}: год {0} — високосный")
    @ValueSource(ints = {2020, 2000, 1600})
    public void userCanCheckIfYearIsLeap(int InitialYear) {
        boolean actualResult = methods.isLeapYear(InitialYear);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: год {0} — невисокосный")
    @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
    public void userCanCheckIfYearIsNotLeap(int InitialYear) {
        boolean actualResult = methods.isLeapYear(InitialYear);

        assertFalse(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: граничный год {0} — високосный")
    @ValueSource(ints = {0, 4, 400})
    public void userCanCheckIfYearIsLeapForBoundaryCases(int InitialYear) {
        boolean actualResult = methods.isLeapYear(InitialYear);

        assertTrue(actualResult);
    }
}
