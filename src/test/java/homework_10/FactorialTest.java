package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - 1 -> 1
     * - 5 -> 120
     * - 7 -> 5040
     * Негативные кейсы:
     * - -3 -> IllegalArgumentException
     * Corner cases:
     * - 0 -> 1
     */


    @ParameterizedTest(name = "Кейс {index}: факториал {0} равен {1}")
    @CsvSource({
            "1, 1",
            "5, 120",
            "7, 5040",
            "0, 1"
    })
    public void userCanCalculateFactorial(int initialInt, int expectedResult) {
        int actualResult = methods.factorial(initialInt);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotCalculateFactorial() {
        assertThrows(IllegalArgumentException.class,
                () -> methods.factorial(-3)
        );
    }
}
