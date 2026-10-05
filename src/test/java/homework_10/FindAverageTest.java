package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычный массив: [1, 2, 3, 4, 5] -> 3.0
     * - Отрицательное и положительное число: [-2, 2] -> 0.0
     * Негативные кейсы:
     * - Пустой массив: [] -> NoSuchElementException
     * Corner cases:
     * - Один элемент: [10] -> 10.0
     */

    public static Stream<Arguments> findAverageCases() {
        return Stream.of(
                // Позитивные кейсы:
                    Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[]{-2, 2}, 0.0),
                // Corner cases:
                Arguments.of(new int[]{10}, 10.0)
        );
    }

    @ParameterizedTest(name = "Кейс {index}: среднее значение в массиве {0} - {1}")
    @MethodSource("findAverageCases")
    public void userCanFindAverageTest(int[] initialArray, double expectedResult) {
        double actualResult = methods.findAverage(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotFindAverageTestWithEmptyArray() {
        assertThrows(NoSuchElementException.class,
                () -> methods.findAverage(new int[]{})
        );
    }
}