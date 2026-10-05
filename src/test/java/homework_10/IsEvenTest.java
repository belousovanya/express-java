package homework_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class Homework10Methods, method isEven")
public class IsEvenTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Чётное положительное число: 2 -> true
     * - Чётное отрицательное число: -2 -> true
     * Негативные кейсы:
     * - Нечетное положительное число: 3 -> false
     * - Нечетное отрицательное число: -3 -> false
     * Corner cases:
     * - Нулевое значение -> true
     * - Integer.MAX_VALUE -> false
     * - Integer.MIN_VALUE -> true
     */


    @ParameterizedTest(name = "Кейс {index}: число {0} — чётное")
    @ValueSource(ints = {
            // позитивные кейсы
            2, -2,
            // corner cases
            0, Integer.MIN_VALUE
    })
    public void userCanCheckIfNumberIsEven(int initialNumber) {
        boolean actualResult = methods.isEven(initialNumber);

        assertTrue(actualResult);
    }


    @ParameterizedTest(name = "Кейс {index}: число {0} — нечётное")
    @ValueSource(ints = {
            // негативные кейсы
            3, -3,
            // corner cases
            Integer.MAX_VALUE
    })
    public void userCanCheckIfNumberIsNotEven(int initialNumber) {
        boolean actualResult = methods.isEven(initialNumber);

        assertFalse(actualResult);
    }
}
