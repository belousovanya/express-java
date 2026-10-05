package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

public class HasDuplicatesTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Есть повторяющееся число: [1, 2, 2, 3] -> true
     * - Все числа одинаковые: [5, 5, 5, 5] -> true
     * Негативные кейсы:
     * - Все числа уникальны: [1, 2, 3, 4, 5] -> false
     * Corner cases:
     * - Один элемент: [7] -> false
     * - Пустой массив: [] -> false
     */

    public static Stream<Arguments> hasDuplicatesPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3}),
                Arguments.of(new int[]{5, 5, 5, 5})
        );
    }

    @ParameterizedTest(name = "Кейс {index}: массив {0} содержит дубликаты")
    @MethodSource("hasDuplicatesPositiveCases")
    public void userCanFindDuplicates(int[] initialNumbers) {
        boolean actualResult = methods.hasDuplicates(initialNumbers);

        assertTrue(actualResult);
    }

    public static Stream<Arguments> hasDuplicatesNegativeAndCornerCases() {
        return Stream.of(
                // Негативные кейсы:
                Arguments.of(new int[]{1, 2, 3, 4, 5}),
                // Corner cases:
                Arguments.of(new int[]{7}),
                Arguments.of(new int[]{})
        );
    }

    @ParameterizedTest(name = "Кейс {index}: массив {0} не содержит дубликаты")
    @MethodSource("hasDuplicatesNegativeAndCornerCases")
    public void userCanNotFindDuplicates(int[] initialNumbers) {
        boolean actualResult = methods.hasDuplicates(initialNumbers);

        assertFalse(actualResult);
    }
}