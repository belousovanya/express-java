package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычные числа: 24, 36 -> 12
     * - Взаимно простые числа: 101, 103 -> 1
     * Corner cases:
     * - Первое число равно нулю: 0, 10 -> 10
     * - Второе число равно нулю: 10, 0 -> 10
     * - Одинаковые числа: 7, 7 -> 7
     */

    @ParameterizedTest(name = "Кейс {index}: у числа {0} и {1} НОД равен {2}")
    @CsvSource({
            // Позитивные кейсы:
            "24, 36, 12",
            "101, 103, 1",
            // Corner cases:
            "0 , 10, 10",
            "10, 0, 10",
            "7, 7, 7"
    })
    public void userCanCalculateGCD(int initialNumberA, int initialNumberB, int expectedResult) {
        int actualResult = methods.gcd(initialNumberA, initialNumberB);

        assertEquals(expectedResult, actualResult);
    }
}