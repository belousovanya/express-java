package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Строки разной длины: ["Java", "C++", "Go"] -> [4, 3, 2]
     * Corner cases:
     * - Пустая строка в списке: ["", "Go"] -> [0, 2]
     * - Пустой список: [] -> []
     */

    public static Stream<Arguments> mapToLengthsCases() {
        return Stream.of(
                // Позитивные кейсы:
                Arguments.of(List.of("Java", "C++", "Go"), List.of(4, 3, 2)),
                // Corner cases:
                Arguments.of(List.of("", "Go"), List.of(0, 2)),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest(name = "Кейс {index}: строка {0} преобразуется в список длин {1}")
    @MethodSource("mapToLengthsCases")
    public void userCanMapToLengthList(List<String> initialList, List<Integer> expectedResult) {
        List<Integer> actualResult = methods.mapToLengths(initialList);

        assertEquals(expectedResult, actualResult);
    }
}
