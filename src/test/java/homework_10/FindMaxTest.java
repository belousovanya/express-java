package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычный массив c положительными числами: [3, 5, 7, 2] -> 7
     * - Обычный массив c отрицательными числами: [-3, -5, -7, -2] -> -2
     * Негативные кейсы:
     * - Пустой массив: [] -> NoSuchElementException
     * - null -> NullPointerException
     * Corner cases:
     * - Одно число в массиве: [1] -> 1
     */

    public static Stream<Arguments> findMaxCases() {
        return Stream.of(
                // Позитивные кейсы:
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2),
                // Corner cases:
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest(name = "Кейс {index}: максимум массива {0} равен {1}")
    @MethodSource("findMaxCases")
    public void userCanFindMaxWithValidArray(int[] initialArray, int expectedResult) {
        int actualResult = methods.findMax(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotFindMaxWithEmptyArray() {
        assertThrows(NoSuchElementException.class,
                () -> methods.findMax(new int[]{})
        );
    }

    @Test
    public void userCanNotFindMaxWithNullArray() {
        assertThrows(NullPointerException.class,
                () -> methods.findMax(null)
        );
    }
}
