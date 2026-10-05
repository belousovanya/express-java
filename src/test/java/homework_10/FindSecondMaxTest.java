package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычный массив: [3, 5, 7, 2] -> 5
     * Негативные кейсы:
     * - Все числа одинаковые: [4, 4, 4, 4] -> NoSuchElementException
     * - Один элемент: [8] -> NoSuchElementException
     * - Пустой массив: [] -> NoSuchElementException
     * Corner cases:
     * - Повторяется не максимальное число: [1, 2, 2, 3] -> 2
     */

    public static Stream<Arguments> findSecondMaxCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{1, 2, 2, 3}, 2)
        );
    }

    @ParameterizedTest(name = "Кейс {index}: второй максимум массива {0} равен {1}")
    @MethodSource("findSecondMaxCases")
    public void userCanFindSecondMax(int[] InitialArray, int expectedResult) {
        int actualResult = methods.findSecondMax(InitialArray);

        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> findSecondMaxCasesForException() {
        return Stream.of(
                Arguments.of(new int[]{4, 4, 4, 4}),
                Arguments.of(new int[]{8}),
                Arguments.of(new int[]{})
        );
    }

    @ParameterizedTest(name = "Кейс {index}: массив {0} — ожидается NoSuchElementException")
    @MethodSource("findSecondMaxCasesForException")
    public void userCanNotFindSecondMax(int[] array) {
        assertThrows(NoSuchElementException.class,
                () -> methods.findSecondMax(array)
        );
    }
}
