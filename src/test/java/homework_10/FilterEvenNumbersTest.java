package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычный список: [1, 2, 3, 4, 5, 6] -> [2, 4, 6]
     * - Есть ноль и отрицательные числа: [0, -2, -3] -> [0, -2]
     * Негативные кейсы:
     * - Нет чётных чисел: [1, 3, 5] -> []
     * Corner cases:
     * - Пустой список: [] -> []
     */

    public static Stream<Arguments> evenNumbersCases() {
        return Stream.of(
                // Позитивные кейсы
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                Arguments.of(List.of(0, -2, -3), List.of(0, -2))
        );
    }

    @ParameterizedTest(name = "Кейс {index}: в списке {0} чётные числа - {1}")
    @MethodSource("evenNumbersCases")
    public void userCanFilterEvenNumber(List<Integer> initialNumbers, List<Integer> expectedNumbers) {
        List<Integer> actualNumbers = methods.filterEvenNumbers(initialNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }

    public static Stream<Arguments> evenNumbersNegativeAndCornerCases() {
        return Stream.of(
                // Негативные кейсы
                Arguments.of(List.of(1, 3, 5), List.of()),
                // Corner cases
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest(name = "Кейс {index}: в списке {0} чётные числа - {1}")
    @MethodSource("evenNumbersNegativeAndCornerCases")
    public void userCanNotFilterEvenNumber(List<Integer> initialNumbers, List<Integer> expectedNumbers) {
        List<Integer> actualNumbers = methods.filterEvenNumbers(initialNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }
 }
